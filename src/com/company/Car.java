package com.company;

class Car {
    private int wheight;
    private String model;
    private int fuel_perc;
    boolean eng_on;

    Car() {
        wheight = 0;
        model = "0";
        fuel_perc = 0;
        eng_on = false;
    }

    Car(String a) {
        model = a;
        wheight = 0;
        fuel_perc = 0;
        eng_on = false;
    }

    Car(String model, int wheight, int fuel_perc) {
        this.model = model;
        this.wheight = wheight;
        this.fuel_perc = fuel_perc;
        eng_on = false;
    }

    public void start() {
        if (eng_on)
            System.out.println("Машина " + model + " уже работает");
        else {
            eng_on = true;
            System.out.println("Машина " + model + " запустилась");
        }
    }

    public void params() {
        System.out.println(model + wheight + fuel_perc);
    }

    public void refill() {
        fuel_perc = 100;
    }

    public void go() {
        if (fuel_perc > 0 && eng_on) {
            fuel_perc--;
            System.out.println("Машина " + model + "едет");
        } else if (!eng_on)
            System.out.println("Машину " + model + "нужно запустить");
        if (fuel_perc == 0)
            System.out.println("Машина " + model + "не поедет без топлива");
    }

    public String getModel() {
        return model;
    }
}