package com.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Parent implements Externalizable {

    String name;
    int id;
    int roll;

    Parent(String name, int id, int roll) {
       this.name = name;
       this.id = id;
       this.roll = roll;
   }

   public Parent() {

   }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(name);
        out.writeInt(id);
        out.writeInt(roll);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        name = (String) in.readObject();
        id = in.readInt();

    }

}
