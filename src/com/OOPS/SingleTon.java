package com.OOPS;

public class SingleTon {

    private static SingleTon singleTon;

    private SingleTon() {

    }

    public static SingleTon getInstance() {

        if(singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    public static void getName() {
        System.out.println("Hello World!");
    }

}

class TestSingleTon {

    public static void main(String[] args) {

        SingleTon singleTon = null;

        System.out.println(singleTon.getInstance());

        singleTon.getName();

        SingleTon singleTon1 = null;

        System.out.println(singleTon1.getInstance());
    }

}


