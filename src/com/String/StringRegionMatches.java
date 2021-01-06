package com.String;

public class StringRegionMatches {

    public static void main(String[] args) {

        regionMatches();
    }

    public static void regionMatches() {

        String str = "Hello World How are you!";
        String str2 = "World";
        String str3 = "WORLD";

        System.out.println(str.regionMatches(6, str2, 0, 5));
        System.out.println(str.regionMatches(true, 6, str3, 0, 5));
        System.out.println(str.regionMatches(false, 6, str3, 0, 5));

    }

}
