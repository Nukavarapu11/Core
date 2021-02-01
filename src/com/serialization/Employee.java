package com.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

    transient Integer id;
    transient String pwd;
    String name;

    Employee(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        int eid = 10 + id;
        String epwd = 123 + pwd;
        oos.writeObject(epwd);
        oos.writeObject(eid);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        //Object obj = ois.readObject();

//        if(obj instanceof Integer) {
//            id = (Integer) obj - 10;
//        }
//
//        if(obj instanceof String) {
//            pwd = ((String) obj).substring(3);
//        }

        Integer eid =(Integer) ois.readObject();
        String epwd =  (String) ois.readObject();

        id = eid - 10;
        pwd = epwd.substring(3);


    }

}
