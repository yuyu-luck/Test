package com.example.springbootdemoprovide.user.model;

import lombok.ToString;

import java.util.Date;
import java.util.Set;

@ToString
public class SysUser {
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String headImgUrl;

    private String phone;

    private String telephone;

    private String email;

    private Date birthday;

    private String sex;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Set<SysRole> sysRoles;

    public SysUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public SysUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public SysUser(Long id, String username, String password, String nickname, String headImgUrl, String phone, String telephone, String email, Date birthday, String sex, Integer status, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.headImgUrl = headImgUrl;
        this.phone = phone;
        this.telephone = telephone;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SysUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Set<SysRole> getSysRoles() {
        return sysRoles;
    }

    public void setSysRoles(Set<SysRole> sysRoles) {
        this.sysRoles = sysRoles;
    }
}
