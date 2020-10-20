package com.accenture.dealership.entity;

public class Car {
    private String brand;
    private String modelCar;
    private double valCar;
    private int yearCar;

    public Car(String brand, String modelCar, double valCar, int yearCar) {
        this.brand = brand;
        this.modelCar = modelCar;
        this.valCar = valCar;
        this.yearCar = yearCar;
    }

    public double getValCar() {
        return valCar;
    }

    public void setValCar(double valCar) {
        this.valCar = valCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }

    @Override
    public String toString() {
        return "Marca do carro: " + this.brand +
                "\nModelo do carro: " + this.modelCar +
                "\nAno do carro: " + this.yearCar +
                "\nValor do carro: " + this.valCar ;

    }
}
