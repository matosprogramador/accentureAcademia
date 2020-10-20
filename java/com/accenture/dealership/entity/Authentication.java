package com.accenture.dealership.entity;

import com.accenture.dealership.entity.employeeType.Manager;

public class Authentication {
    private Manager manager;


    public Authentication( Manager manager) {
        this.manager = manager;
    }

    public boolean logIn(String pass){

        return manager.getPassword().equals(pass);
    }
}
