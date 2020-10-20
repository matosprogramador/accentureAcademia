package com.accenture.dealership.entity;


public class Client {
    private String name;
    private boolean handicapped;

    public Client(String name,  boolean handicapped) {
        this.name = name;
        this.handicapped = handicapped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHandicapped() {
        return handicapped;
    }

    public void setHandicapped(boolean handicapped) {
        this.handicapped = handicapped;
    }
}
