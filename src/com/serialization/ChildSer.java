package com.serialization;

import java.io.*;

public class ChildSer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ChildAnimal ca = new ChildAnimal("Ravi");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Child.txt"));
        oos.writeObject(ca);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Child.txt"));
        ChildAnimal c1 = (ChildAnimal) ois.readObject();
        System.out.println(c1.name + c1.cName + c1.iid);

    }

}
