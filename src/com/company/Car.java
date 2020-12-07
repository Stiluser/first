package com.company;

class Car extends Vehicle {
    @Override
    public void start() {
        if (engOn)
            System.out.println("Машина " + model + " уже работает");
        else {
            engOn = true;
            System.out.println("Машина " + model + " запустилась");
        }
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


}