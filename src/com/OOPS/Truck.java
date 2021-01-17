package com.OOPS;

public class Truck extends Vehicle implements Car{

    @Override
    public void EV(String name) {
        System.out.println("This is an EV: " + name);
        super.accelerate();
    }


}
