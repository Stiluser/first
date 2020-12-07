package com.company;

class Airplane extends Vehicle {
    int numOfWings = 2;

    Airplane(String model, int wheight, int fuelPerc) {
        super(model, wheight, fuelPerc);
    }

    @Override
    public void start() {
        if (engOn)
            System.out.println("Самолет " + model + " уже работает");
        else {
            engOn = true;
            System.out.println("Самолет " + model + " запустился");
        }
    }

    public void fly() {
        if (fuelPerc > 0 && engOn) {
            fuelPerc--;
            System.out.println("Самолет " + model + "летит");
        } else if (!engOn)
            System.out.println("Самолет " + model + "нужно запустить");
        if (fuelPerc == 0)
            System.out.println("Самолет " + model + "не полетит без топлива");
    }
}