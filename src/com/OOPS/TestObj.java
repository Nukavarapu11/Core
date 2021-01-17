package com.OOPS;

public class TestObj {

    private ObjectTest objectTest;

    public ObjectTest getParams(ObjectTest objectTest, String name) {

        if(objectTest.getName().equals(name) && objectTest.getInternalObj().getInternalName().equals("L")) {
            return objectTest;
        }
        return null;
    }

}
