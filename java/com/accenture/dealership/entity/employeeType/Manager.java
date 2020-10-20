package com.accenture.dealership.entity.employeeType;

import com.accenture.dealership.entity.Authentication;
import com.accenture.dealership.entity.Employee;
import com.accenture.dealership.entity.Sale;

public class Manager extends Employee {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String authenticate(String pass , Sale sale){
       var authorized = new Authentication(this);

       if(authorized.logIn(pass)){
            sale.setAuthenticated(true);
            return "Venda liberada";
       }else{
           return "Senha incorreta.";
       }
    }

}
