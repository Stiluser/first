package com.company;
class Airplane {
    private int wheight;
    private String model;
    private int fuelPerc;
    boolean engOn;

    Airplane() {
        wheight=0;
        model="none";
        fuelPerc =0;
        engOn = false;
    }
    Airplane(String model){
        this.model = model;
        wheight = 0;
        fuelPerc = 0;
        engOn = false;
    }
    Airplane(String model,int wheight,int fuel_perc){
        this.model = model;
        this.wheight = wheight;
        this.fuelPerc = fuel_perc;
        engOn = false;
    }
    public void start(){
        if (engOn)
            System.out.println("Самолет "+ model +" уже работает");
        else {
            engOn = true;
            System.out.println("Самолет " + model + " запустилась");
        }
    }
    public void params(){
        System.out.println(model + wheight + fuelPerc);
    }
    public void refill(){
        fuelPerc = 100;
    }
    public void fly(){
        if (fuelPerc >0 && engOn) {
            fuelPerc--;
            System.out.println("Самолет " + model + "летит");
        }
        else if (!engOn)
            System.out.println("Самолет "+ model +"нужно запустить");
        if (fuelPerc ==0)
            System.out.println("Самолет "+ model +"не полетит без топлива");
    }
}