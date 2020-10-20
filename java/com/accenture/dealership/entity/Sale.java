package com.accenture.dealership.entity;

import com.accenture.dealership.entity.employeeType.Intern;

public class Sale {
    private Car car;
    private Employee employee;
    private Client client;
    private int plots;
    private boolean authenticated = false ;



    public Sale(Car car, Employee employee, Client client,int plots) {
        this.car = car;
        this.employee = employee;
        this.client = client;
        this.plots = plots;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public String vender() {
        if (employee instanceof Intern) {
            if (this.authenticated){
                return "Vendido com sucesso!" +
                        "\nParabéns " + client.getName() +
                        "\nVocê acaba de adiquirir uma máquina!" +
                        "\n====================================\n" +
                        car.toString() +
                        "\n====================================\n" +
                        rules();


            }else{
                return "venda não autorizada";
            }
        }
        return "Vendido com sucesso!" +
                "\nParabéns " + client.getName() +
                "\nVocê acaba de adiquirir uma máquina!" +
                "\n====================================\n" +
                car.toString() +
                "\n====================================\n" +
                rules();
    }

    private String rules(){
        double valCAR = car.getValCar();
        String message;

        if (!client.isHandicapped()){
            valCAR *= 1.15;
        }

        if(this.plots > 1){
            double interest = valCAR * 0.0189 * this.plots;
            valCAR += interest;
            message = "Preço total:" + valCAR + " \nParcelas"+ plots + "x: " + valCAR / plots;
        }else{
            valCAR -= valCAR * 0.10;
            message = "Preço total:" + valCAR;
        }

        return message;
    }


}
