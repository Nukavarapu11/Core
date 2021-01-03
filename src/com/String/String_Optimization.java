package com.String;

public class String_Optimization {

    public static void main(String[] args) {

        //newKeyword();
        //literal();
        intern();

    }

    public static void newKeyword() {

        long start = System.currentTimeMillis();

        for(int i=0; i<50000; i++) {
            String s = new String("Hello");
        }

        long end = System.currentTimeMillis();

        System.out.println("Total Time: " + (end - start) + " ms");
    }

    public static void literal() {

        long start = System.currentTimeMillis();

        for(int i=0; i<50000; i++) {
            String s = "Hello";
        }

        long end = System.currentTimeMillis();

        System.out.println("Total Time: " + (end - start) + " ms");
    }

    public static void intern() {

        String s = "Hello";

        long start = System.currentTimeMillis();

        for(int i=0; i<50000; i++) {
            s = s.intern();
        }

        long end = System.currentTimeMillis();

        System.out.println("Total Time: " + (end - start) + " ms");

    }

}
