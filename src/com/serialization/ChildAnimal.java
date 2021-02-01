package com.serialization;

import java.io.Serializable;

public class ChildAnimal extends Animal implements Serializable {

    String cName = "Child";
    int iid = 2;

    ChildAnimal(String name) {
        super(name);
        System.out.println("child constructor");
    }

    {
        System.out.println("child instance block");
    }
}
