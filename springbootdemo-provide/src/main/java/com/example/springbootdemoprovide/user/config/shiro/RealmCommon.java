package com.example.springbootdemoprovide.user.config.shiro;//package com.example.commom.shiro;

import com.example.springbootdemoprovide.user.model.SysPermission;
import com.example.springbootdemoprovide.user.model.SysRole;
import com.example.springbootdemoprovide.user.model.SysUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.util.CollectionUtils;

import java.util.Set;


/**
 * 公共授权realm域
 */
public class RealmCommon extends AuthorizingRealm {

    @Override
    public void setName(String name) {
        super.setName("RealmCommon");
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

        Set<SysRole> roles = user.getSysRoleList();
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
        return null;
    }
}

