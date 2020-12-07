package com.company;
class Airplane {
    private int wheight;
    String model;
    private int fuel_perc;
    boolean eng_on;

    Airplane() {
        wheight=0;
        model="none";
        fuel_perc=0;
        eng_on = false;
    }
    Airplane(String model){
        this.model = model;
        wheight = 0;
        fuel_perc = 0;
        eng_on = false;
    }
    Airplane(String model,int wheight,int fuel_perc){
        this.model = model;
        this.wheight = wheight;
        this.fuel_perc = fuel_perc;
        eng_on = false;
    }
    public void start(){
        if (eng_on)
            System.out.println("Самолет "+ model +" уже работает");
        else {
            eng_on = true;
            System.out.println("Самолет " + model + " запустилась");
        }
    }
    public void params(){
        System.out.println(model + wheight + fuel_perc);
    }
    public void refill(){
        fuel_perc = 100;
    }
    public void fly(){
        if (fuel_perc>0 && eng_on ) {
            fuel_perc--;
            System.out.println("Самолет " + model + "летит");
        }
        else if (!eng_on)
            System.out.println("Самолет "+ model +"нужно запустить");
        if (fuel_perc==0)
            System.out.println("Самолет "+ model +"не полетит без топлива");
    }
}