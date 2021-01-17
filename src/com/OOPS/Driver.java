package com.OOPS;

public class Driver {

    private ObjectTest objectTest;
    private TestObj testObj;
    private InternalObj internalObj;

    public static void main(String[] args) {

        Driver driver = new Driver();

        ObjectTest obj = driver.getObj();

        System.out.println(obj);

    }

    public ObjectTest getObj() {

        objectTest = new ObjectTest();
        internalObj = new InternalObj();

        objectTest.setName("Ravi");
        objectTest.setCompany("Aperture");
        objectTest.setId(1);
        internalObj.setInternalName("L");
        internalObj.setInternalId(16);
        internalObj.setEmployeeType("Full-Time");
        objectTest.setInternalObj(internalObj);

        testObj = new TestObj();

        objectTest = testObj.getParams(objectTest, "Ravi");

        return objectTest;

    }

}
