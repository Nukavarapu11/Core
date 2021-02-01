package com.serialization;

public class Animal {

    String name = "Ravi";
    int id = 1;

    Animal() {
        System.out.println("Default constructor");
    }

    Animal(String name) {
        System.out.println("Parameterized constructor");
        this.name = name;
    }

    {
        System.out.println("parent instance block");
    }

}
