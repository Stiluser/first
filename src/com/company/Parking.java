package com.company;
import java.util.ArrayList;
public class Parking {
    ArrayList<Car> test = new ArrayList<>();
    public void add(Car a){
        test.add(a);
    }
    public void list(){
        for (Car car : test) {

            System.out.println(car.getModel());
        }
    }
}
