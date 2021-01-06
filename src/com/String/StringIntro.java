package com.String;

public class StringIntro {

    public static void main(String[] args) {
        //constantPool();
        //immutableStr();
        //buffer();
        immutable("HelloWorld!");
    }

    public static void constantPool() {

        String s = "Welcome!";

        String str = "Welcome!";

        System.out.println(s);

        System.out.println(str);

    }

    public static void immutableStr() {

        String s = "HelloWorld!";

        s.concat("How are you");

        System.out.println(s);

        s = "How are you";

        System.out.println(s);

    }

    public static void buffer() {

        StringBuffer sbuff = new StringBuffer();

        sbuff.append("HelloWorld!");
        sbuff.append("How are you");

        System.out.println(sbuff);

    }

    public static void immutable(String str) {

        System.out.println(str + " how");

    }

}
