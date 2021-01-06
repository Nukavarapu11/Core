package com.String;

public class String_CharPair_Swap {

    public static void main(String[] args) {

        //charPairSwap("Hellopi");
        //swapFirstAndLadt();
        test();

    }

    public static void charPairSwap(String s) {

        char[] c = s.toCharArray();
        char temp;
        int j = 1;
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < c.length - 1; i += 2) {

                temp = c[i];
                c[i] = c[i + 1];
                c[i + 1] = temp;

            }
        }

        System.out.println(new String(c));
    }

    public static void swapFirstAndLadt() {

        String s = "Hello";

        char[] c = s.toCharArray();

        char temp = 0;

        temp = c[c.length - 1];
        c[c.length - 1] = c[0];
        c[0] = temp;

        System.out.println(new String(c));

    }

    public static void test() {
        String s = "abc";
        String s1 = "abc";

        if (s==s1){
            System.out.println("true");
        }

        String s2 = new String("abc");
        String s3 = new String("abc");

        if(s2==s3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
