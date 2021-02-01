package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ser {

    Ser(){
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        Dog dog = new Dog();
        Cat cat = new Cat();

        FileOutputStream fos = new FileOutputStream("serobj.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);
        oos.writeObject(cat);
        oos.flush();
        fos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("serobj.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog obj = (Dog) ois.readObject();

        System.out.println(obj.name + " " + obj.c1.name);



    }

}
