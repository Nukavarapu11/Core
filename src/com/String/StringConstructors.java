package com.String;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringConstructors {

    public static void main(String[] args) throws Exception {

        byte[] b = new byte[] {71,72,101,108,118};
        Charset c = Charset.defaultCharset();

        char[] ch = new char[] {'H','e','l','l','o','W','o','r','l','d','!'};

        int[] i = new int[] {71,72,73,74,75};

        StringBuffer sbuff = new StringBuffer("Hello");
        sbuff.append("World");

        StringBuilder sb = new StringBuilder("Foo");
        sb.append("Bar");

        strCon1(b);
        strCon2(b, c);
        strCon3(b, "UTF-8");
        strCon4(b, 1, 4);
        strCon5(b, 1, 4, c);
        strCon6(b, 1, 4, "UTF-8");
        strCon7(ch);
        strCon8(ch, 1, 4);
        strCon9(i, 1, 4);
        strCon10(sbuff);
        strCon11(sb);

    }

    public static void strCon1(byte[] b) {

        String s = new String(b);
        System.out.println(s);

    }

    public static void strCon2(byte[] b, Charset c) {

        String s = new String(b, c);
        System.out.println(s);
    }

    public static void strCon3(byte[] b, String charset) throws Exception {

        String s = new String(b, charset);
        System.out.println(s);
    }

    public static void strCon4(byte[] b, int startIndex, int length) {

        String s = new String(b, startIndex, length);
        System.out.println(s);
    }

    public static void strCon5(byte[] b, int startIndex, int length, Charset c){

        String s = new String(b, startIndex, length, c);
        System.out.println(s);
    }

    public static void strCon6(byte[] b, int startIndex, int length, String charSet) throws Exception {

        String s = new String(b, startIndex, length, charSet);
        System.out.println(s);
    }

    public static void strCon7(char[] c) {

        String s = new String(c);
        System.out.println(s);
    }

    public static void strCon8(char[] c, int startIndex, int length) {

        String s = new String(c, startIndex, length);
        System.out.println(s);
    }

    public static void strCon9(int[] i, int startIndex, int length) {

        String s = new String(i, startIndex, length);
        System.out.println(s);
    }

    public static void strCon10(StringBuffer sbuff) {

        String s = new String(sbuff);
        System.out.println(s);
    }

    public static void strCon11(StringBuilder sb) {

        String s = new String(sb);
        System.out.println(s);
    }

}
