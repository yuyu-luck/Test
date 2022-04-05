package com.example.springbootdemoprovide.user.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class User implements Serializable {
    private Integer id;

    private String name;

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