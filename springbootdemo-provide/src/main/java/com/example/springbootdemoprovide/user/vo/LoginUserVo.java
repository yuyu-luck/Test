package com.example.springbootdemoprovide.user.vo;

import com.example.springbootdemoprovide.user.model.SysPermission;
import com.example.springbootdemoprovide.user.model.SysRole;
import com.example.springbootdemoprovide.user.model.SysUser;

import java.util.Set;

/**
 * 登录用户类
 */
public class LoginUserVo {

    /**
     * 用户对象
     */
    private SysUser sysUser;

    /**
     * 该用户拥有的角色列表
     */
    private Set<SysRole> sysRoles;

    /**
     * 该用户拥有的权限列表
     */
    private Set<SysPermission> sysPermissions;

    public LoginUserVo() {
    }

    public LoginUserVo(SysUser sysUser, Set<SysRole> sysRoles, Set<SysPermission> sysPermissions) {
        this.sysUser = sysUser;
        this.sysRoles = sysRoles;
        this.sysPermissions = sysPermissions;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Set<SysRole> getSysRoles() {
        return sysRoles;
    }

    public void setSysRoles(Set<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
    }

    public Set<SysPermission> getSysPermissions() {
        return sysPermissions;
    }

    public void setSysPermissions(Set<SysPermission> sysPermissions) {
        this.sysPermissions = sysPermissions;
    }
}
