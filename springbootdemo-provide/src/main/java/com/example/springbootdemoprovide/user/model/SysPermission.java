package com.example.springbootdemoprovide.user.model;

public class SysPermission {
    private Long id;

    private Integer parentId;

    private String name;

    private String css;

    private String href;

    private Integer type;

    private String permission;

    private Integer sort;

    public SysPermission(Long id, Integer parentId, String name, String css, String href, Integer type, String permission, Integer sort) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.css = css;
        this.href = href;
        this.type = type;
        this.permission = permission;
        this.sort = sort;
    }

    public SysPermission() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}