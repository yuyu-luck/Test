package com.example.springbootdemoprovide.user.model;

public class UserIndex {
    private Integer id;

    private String firstName;

    private String lastName;

    private String idCard;

    private String information;

    public UserIndex(Integer id, String firstName, String lastName, String idCard, String information) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idCard = idCard;
        this.information = information;
    }

    public UserIndex() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}