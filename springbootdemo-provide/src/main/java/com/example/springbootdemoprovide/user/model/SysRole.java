package com.example.springbootdemoprovide.user.model;

import lombok.ToString;

import java.util.Date;

@ToString
public class SysRole {
    private Long id;

    private String name;

    private String description;

    private Date createTime;

    private Date updateTime;

    public SysRole(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SysRole(Long id, String name, String description, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SysRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
