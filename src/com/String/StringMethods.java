package com.String;

public class StringMethods {

    public static void main(String[] args) {

        //length();
        //toLowerCase();
        //toUppercase();
        //concat();
        //charAt();
        //comparesTo();
        //compareToIgnoreCase();
        //subString();
        //subString2();
        indexOf();
        indexOf2();
        lastIndexOf();
        lastIndexOf2();
        //equals();
        //equalsIgnoreCase();
        //trim();
        //replace();
    }

    public static void length() {

        String s = "Hello";
        System.out.println(s.length());
    }

    public static void toUppercase() {

        String s = "Foo";
        System.out.println(s.toUpperCase());
    }

    public static void toLowerCase() {

        String s = "BaR";
        System.out.println(s.toLowerCase());
    }

    public static void concat() {

        String s = "Hello";
        s = s.concat("World!");
        System.out.println(s);
    }

    public static void subString() {

        String s = "Hello World!";
        s = s.substring(2);
        System.out.println(s);
    }

    public static void subString2() {

        String s = "Hello Wold!";
        s = s.substring(1, 3);
        System.out.println(s);
    }

    public static void charAt() {

        String s = "GeeksForGeeks";
        System.out.println(s.charAt(7));
    }

    public static void indexOf() {

        String s = "HelloWorld";
        int i = s.indexOf("W");
        System.out.println(i);
    }

    public static void indexOf2() {

        String s = "HelloWorld";
        int i = s.indexOf("o", 6);
        System.out.println(i);
    }

    public static void lastIndexOf() {

        String s = "HelloWorld";
        int i = s.lastIndexOf("o");
        System.out.println(i);
    }

    public static void lastIndexOf2() {

        String s = "HelloWorldd";
        int i = s.lastIndexOf("d", 9);
        System.out.println(i);
    }

    public static void equals() {

        String s = "HelloWorld";
        String str = "HELLOWORLD";
        System.out.println(s.equals(str));
    }

    public static void equalsIgnoreCase() {

        String s = "HelloWorld";
        String str = "HELLOWORLD";
        System.out.println(s.equalsIgnoreCase(str));
    }

    public static void comparesTo() {

        String s = "Hello";
        String str = "World!";
        System.out.println(s.compareTo(str));
    }

    public static void compareToIgnoreCase() {

        String s = "Hello";
        String str = "World!";
        System.out.println(s.compareToIgnoreCase(str));
    }

    public static void trim() {

        String s = " Hell o ";
        System.out.println(s.trim());
    }

    public static void replace() {

        String s = "Hello";
        System.out.println(s.replace("l", "o"));
    }

}
