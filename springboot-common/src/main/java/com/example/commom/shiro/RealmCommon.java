package com.example.commom.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.util.CollectionUtils;


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
     * @param principalCollection 身份信息集合
     * @return 授权信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //1.获取认证的用户数据 | devtools冲突导致无法强转,需更改类加载器:resources/META-INF/spring-devtools.properties
        UserEntity user = (UserEntity)principalCollection.getPrimaryPrincipal();
        //2.构造认证数据
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        Set<RoleEntity> roles = user.getRoleList();
        if (CollectionUtils.isEmpty(roles)) {
            //用户没有角色
            throw new AuthorizationException();
        }

        for (RoleEntity role:roles){
            //添加角色信息
            info.addRole(role.getRoleName());
            //角色权限
            Set<PermissionEntity> permissions = role.getPermissions();
            for (PermissionEntity permissionEntity : permissions) {
                info.addStringPermission(permissionEntity.getPermissionname());
            }
        }

        return info;
    }

    /**
     * 认证方法在登录模块中补全
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}

