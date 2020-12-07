package com.company;

public class AirGasStation {
    private String name;

    AirGasStation(String name) {
        this.name = name;
    }

    public void refill(Airplane airplane) {
        airplane.refill();
        System.out.println("Самолет заправлен");
    }
}
