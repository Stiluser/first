package com.company;

class Car {
    private int weight;
    private String model;
    private int fuelPerc;
    boolean engOn;

    Car() {
        weight = 0;
        model = "0";
        fuelPerc = 0;
        engOn = false;
    }

    Car(String a) {
        model = a;
        weight = 0;
        fuelPerc = 0;
        engOn = false;
    }

    Car(String model, int wheight, int fuelPerc) {
        this.model = model;
        this.weight = wheight;
        this.fuelPerc = fuelPerc;
        engOn = false;
    }

    public void start() {
        if (engOn)
            System.out.println("Машина " + model + " уже работает");
        else {
            engOn = true;
            System.out.println("Машина " + model + " запустилась");
        }
    }

    public void params() {
        System.out.println(model + weight + fuelPerc);
    }

    public void refill() {
        fuelPerc = 100;
    }

    public void go() {
        if (fuelPerc > 0 && engOn) {
            fuelPerc--;
            System.out.println("Машина " + model + "едет");
        } else if (!engOn)
            System.out.println("Машину " + model + "нужно запустить");
        if (fuelPerc == 0)
            System.out.println("Машина " + model + "не поедет без топлива");
    }

    public String getModel() {
        return model;
    }
}