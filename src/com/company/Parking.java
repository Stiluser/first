package com.company;

import java.util.ArrayList;

public class Parking {
    ArrayList<Car> test = new ArrayList<>();

    public void add(Car a) {
        test.add(a);
    }

    public void list() {
        for (Car car : test) {

            System.out.println(car.getModel());
        }
    }

    public void refillAll() {
        for (Car car : test)
            car.refill();
        System.out.println("Все машины заправлены");
    }
}
