package com.company;
class Gas_station{
    private String name;
    Gas_station(String name){
        this.name = name;
    }
    public void refill(Car a){
        a.refill();
        System.out.println("Машина " + a.getModel() + " заправлена");
    }

}
