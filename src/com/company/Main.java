package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int ll = 0;
        Car volvo1 = new Car("вольво", 50, 50);
        GasStation lukoil1 = new GasStation("Лукойл 1");
        GasStation lukoil2;

        volvo1.params();
        lukoil1.refill(volvo1);
        volvo1.params();
        volvo1.start();
        //System.out.println(volvo1.getModel());
        Parking park1 = new Parking();
        park1.add(volvo1);
        park1.add(volvo1);
        park1.add(volvo1);
        park1.add(volvo1);
        park1.add(volvo1);
        park1.add(volvo1);
        park1.add(volvo1);
        park1.list();

    }
}
