package com.company;

public class Vehicle {
    protected int weight;
    protected String model;
    protected int fuelPerc;
    protected boolean engOn;
    Vehicle() {
        weight = 0;
        model = "0";
        fuelPerc = 0;
        engOn = false;
    }

    Vehicle(String a) {
        model = a;
        weight = 0;
        fuelPerc = 0;
        engOn = false;
    }

    Vehicle(String model, int wheight, int fuelPerc) {
        this.model = model;
        this.weight = wheight;
        this.fuelPerc = fuelPerc;
        engOn = false;
    }
    public void params(){
        System.out.println(model + weight + fuelPerc);
    }
    public void refill(){
        fuelPerc = 100;
    }
    public String getModel() { return model; }
    public void start(){
        if (engOn)
            System.out.println("Транспортное средство "+ model +" уже работает");
        else {
            engOn = true;
            System.out.println("Транспортное средство " + model + " запустилось");
        }
    }

}
