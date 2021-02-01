package com.serialization;

import java.io.*;

public class TestSer {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee e = new Employee(1, "Ravi", "Hi!");

        FileOutputStream fos = new FileOutputStream("outputSer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();

        FileInputStream fis = new FileInputStream("outputSer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee e1 = (Employee) ois.readObject();
        System.out.println(e1.id + " " +e1.name + " " + e1.pwd);

    }

}
