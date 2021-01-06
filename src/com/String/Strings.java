package com.String;

import java.nio.charset.Charset;

import com.intro.*;

public class Strings {

    static String str = "Hello";
    static String str1 = "heLLo";
    static String str2 = "Hell;o";
    static String str3 = "He;l;l;o";

    public static void main(String[] args) {

        //chatAt();
        //length();
        //2
        //subString();
        //trim();
        //4
        //indexOf();
        //4
        //lastIndexOf();
        //hash();
        //2
        //equals();
        //concat();
        //contains();
        //contentEquals();
        //2
        //startsWith();
        //endsWith();
        //getBytes();
        //replace();
        //split();
        //splitOffset();
        //valueOf();
        //codePointAt();
        compareTo();
    }

    public static void chatAt() {
        System.out.println(str.charAt(2));
    }

    public static void length() {
        System.out.println(str.length());
    }

    //2
    public static void subString() {
        System.out.println(str.substring(3));
        System.out.println(str.substring(1, 4)); //returns beginning from startIndice to endIndice-1
    }

    public static void trim() {
        String s = " Hel lo ";
        System.out.println(s);
        System.out.println(s.trim());
    }

    //4
    public static void indexOf() {
        System.out.println(str.indexOf(2)); //input should be in char a unicode value
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf(2, 3));
        System.out.println(str.indexOf("l", 3));
    }

    //4
    public static void lastIndexOf() {
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("l", 3));
        System.out.println(str.lastIndexOf('h'));
        System.out.println(str.lastIndexOf('H'));
        System.out.println(str.lastIndexOf('h', 2));
        System.out.println(str.lastIndexOf(4));
    }

    public static void hash() {
        System.out.println(str.hashCode());
    }

    public static void equals() {
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
    }

    public static void concat() {
        String s = str.concat(str1);
        System.out.println(s);
    }

    public static void contains() {
        System.out.println(str.contains("H"));
    }

    public static void contentEquals() {
        System.out.println(str.contentEquals(str1));
    }

    //2
    public static void startsWith() {
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("H", 1));
        System.out.println(str.startsWith("H", 0));
    }

    public static void endsWith() {
        System.out.println(str.endsWith("o"));
    }

    public static void getBytes() {
        System.out.println(str.getBytes());
        System.out.println(str.getBytes(Charset.defaultCharset()));
    }

    public static void replace() {
        System.out.println(str.replace("H", "h"));
        System.out.println(str.replace('l', 'f'));
    }

    public static void split() {
        String[] s = str2.split(";");
        System.out.println(s[0]);
        System.out.println(s[1]);
        //System.out.println(s[2]);
    }

    public static void splitOffset() {
        String[] s = str3.split(";", 3); //splits strings into the given Offset
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
    }

    public static void valueOf() {
        char[] c = {'H', 'E', 'L', 'L', 'O'};
        boolean b = true;
        Car car = new Car();
        car.setMake("Hello");
        String s = null;
        System.out.println(s.valueOf(c));
        System.out.println(s.valueOf(b));
        System.out.println(s.valueOf(car.getMake()));
    }

    public static void codePointAt() {
        System.out.println(str.codePointAt(1)); //returns unicode point of the specified character.
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(0,2));
    }

    public static void compareTo() {
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
    }

}
