package com.accenture.dealership.entity;

public abstract class Employee {
    private String name;
    private String socialID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialID() {
        return socialID;
    }

    public void setSocialID(String socialID) {
        this.socialID = socialID;
    }
}
