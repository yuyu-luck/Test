package com.example.springbootdemoprovide.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@ToString
@ApiModel(description = "用户实体类")
public class User implements Serializable {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("账号")
    private String name;
    @ApiModelProperty("密码")
    private String passward;

    public User(Integer id, String name, String passward) {
        this.id = id;
        this.name = name;
        this.passward = passward;
    }

    public User(String name, String passward) {
        this.passward = passward;
    }


    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
}