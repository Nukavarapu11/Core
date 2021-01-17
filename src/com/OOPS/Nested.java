package com.OOPS;

public class Nested {

    static class Test {
        //String s  = "Hello";

        public static void getNumber() {
            System.out.println("Hello World!");
        }

    }

}

class Main4 {

    public static void main(String[] args) {

        Nested.Test test = new Nested.Test();

        test.getNumber();

    }

}
