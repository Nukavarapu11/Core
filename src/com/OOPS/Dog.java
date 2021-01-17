package com.OOPS;

public class Dog extends Animal {

    public void getName() {
        System.out.println("My Name is: " + name);
    }

    @Override
    public void eat() {
        System.out.println("I eat my food");
    }
}
