package com.intro;

public class DataTypes {

    public static void main(String[] args) {

        booleanTest(true);
        byteTest((byte) 124);
        testBinary(124);

        String s = "A";
        String str = s;
        s = s.concat("B");

        String b = "A";

        b = b.replace('A', 'B');

        System.out.println("b: " + b);

        System.out.println(str);

        System.out.println(s);

    }

    public static void booleanTest(boolean b) {

        String test = b == true ? "Hello!" : "GoodBye!";
        System.out.println(test);

    }

    public static void byteTest(byte b) {

        System.out.println(b);

        //System.out.println(b++);

        byte a = b++;

        byte c = a++;

        System.out.println(c);

        System.out.println(a);

        System.out.println(a);

        System.out.println(a += 5);

        System.out.println(a + 10);

    }

    public static void testBinary(int i) {

        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.highestOneBit(i));
        System.out.println(Integer.lowestOneBit(i));

    }

}
