package com.company;

class GasStation {
    private String name;

    GasStation(String name) {
        this.name = name;
    }

    public void refill(Car a) {
        a.refill();
        System.out.println("Машина " + a.getModel() + " заправлена");
    }

}
