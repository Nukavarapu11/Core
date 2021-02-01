package com.serialization;

import java.io.*;

public class TestExt {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("external.txt"));
        oos .writeObject(new Parent("Ravi", 1, 2));

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("external.txt"));
        Parent p = (Parent) ois.readObject();
        System.out.println(p.name+ " " +  p.id + " " + p.roll);

    }

}
