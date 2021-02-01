package com.OOPS;

import com.intro.Inter;

public class Driver {

    public static void main(String[] args) throws InterruptedException {

        Driver driver = new Driver();

        //ObjectTest obj = driver.getObj();
        Thread t3 = new Thread() {
            public void run() {
                ObjectTest obj = null;
                for (int i = 0; i < 100000; i++) {
                    obj = driver.getObj();
                    //System.out.println("T3: " + obj);
                }
                System.out.println("T3: " + obj);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                ObjectTest obj = null;
                for (int i = 0; i < 100000; i++) {
                    obj = driver.getObj1();
                }
                System.out.println("T2: " + obj);
            }
        };

        Thread t1 = new Thread() {
            public void run() {
                ObjectTest obj = null;
                for (int i = 0; i < 10000; i++) {
                    obj = driver.getObj();
                    //System.out.println("T1: " + obj);
                }
                System.out.println("T1: " + obj);
            }
        };

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());
    }
    ObjectTest objectTest;
    TestObj testObj;
    InternalObj internalObj;

    public ObjectTest getObj() {

        objectTest = getObjectTest();
        internalObj = getInternalObj();

        objectTest.setName("Ravi");
        objectTest.setCompany("Aperture");
        objectTest.setId(1);
        internalObj.setInternalName("L");
        internalObj.setInternalId(16);
        internalObj.setEmployeeType("Full-Time");
        objectTest.setInternalObj(internalObj);

        testObj = getTestObj();

        objectTest = testObj.getParams(objectTest, "Ravi");

        return objectTest;

    }

    public ObjectTest getObj1() {

        objectTest = getObjectTest();
        internalObj = getInternalObj();

        objectTest.setName("Ravi");
        objectTest.setCompany("Google");
        objectTest.setId(1);
        internalObj.setInternalName("L");
        internalObj.setInternalId(16);
        internalObj.setEmployeeType("Full-Time");
        objectTest.setInternalObj(internalObj);

        testObj = getTestObj();

        objectTest = testObj.getParams(objectTest, "Ravi");

        return objectTest;

    }

    private ObjectTest getObjectTest() {
        if(this.objectTest == null) {
            objectTest = new ObjectTest();
        }
        return objectTest;
    }

    private TestObj getTestObj() {
        if(this.testObj == null) {
            testObj = new TestObj();
        }
        return testObj;
    }

    private InternalObj getInternalObj() {
        if(this.internalObj == null) {
            internalObj = new InternalObj();
        }
        return internalObj;
    }

}
