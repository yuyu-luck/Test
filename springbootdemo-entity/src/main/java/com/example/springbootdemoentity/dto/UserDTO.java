package com.example.springbootdemoentity.dto;

import lombok.Data;
import lombok.ToString;

@ToString
public class UserDTO {
    private Integer id;

    private String name;

    private String passward;

    public UserDTO(Integer id, String name, String passward) {
        this.id = id;
        this.name = name;
        this.passward = passward;
    }

    public UserDTO() {
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
