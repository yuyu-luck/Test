package com.example.springbootdemoprovide.user.config.shiro;//package com.example.commom.shiro;

import com.example.springbootdemoprovide.user.mapper.SysUserMapper;
import com.example.springbootdemoprovide.user.model.SysPermission;
import com.example.springbootdemoprovide.user.model.SysRole;
import com.example.springbootdemoprovide.user.model.SysUser;
import com.example.springbootdemoprovide.user.service.SysUserService;
import com.example.springbootdemoprovide.user.vo.LoginUserVo;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.Set;


/**
 * 公共授权realm域
 */
public class RealmCommon extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;


    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }



    /**
     * 只重写授权方法
     * @param principalCollection 身份信息集合 当前登录对象(主体)
     * @return 授权信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //1.获取认证的用户数据 | devtools冲突导致无法强转,需更改类加载器:resources/META-INF/spring-devtools.properties
        SysUser user = (SysUser)principalCollection.getPrimaryPrincipal();
        //2.构造认证数据
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        Set<SysRole> roles = user.getSysRoles();
        if (CollectionUtils.isEmpty(roles)) {
            //用户没有角色
            throw new AuthorizationException();
        }

        for (SysRole role:roles){
            //添加角色信息
            info.addRole(role.getName());
            //角色权限
            Set<SysPermission> permissions = role.getSysPermsissions();
            for (SysPermission syserPermission : permissions) {
                info.addStringPermission(syserPermission.getName());
            }
        }

        return info;
    }

    /**
     * 认证方法在登录模块中补全 身份验证(为当前登录用户进行身份验证)
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        try {
            //1、从token中获取当前用户的信息
            String username=(String)authenticationToken.getPrincipal();
            //2、调用根据用户名查询的方法
           SysUser user= sysUserService.findByName(username);
           //3、判断user是否为空，不为空则表示用户存在
            if(user!=null){
                //4、创建登录用户对象
                LoginUserVo loginUserVo=new LoginUserVo(user,null,null);
                //5、创建盐值（以用户名作为盐值）
                ByteSource salt=ByteSource.Util.bytes(user.getUsername());
                //6、验证登录密码是否正确
                 //参数1：用户名 参数2：密码 参数3：加密的盐值 参数4：域名（填写任意字符串)
                SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(user.getUsername(),
                 user.getPassword(),salt,this.getName());
                //7、如果info对象正常运行，表示登录成功
                return info;
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        //登录失败
        return null;

    }
}

