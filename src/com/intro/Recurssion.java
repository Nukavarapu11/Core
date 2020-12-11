package com.intro;

public class Recurssion {

    public static void main(String[] args) {

       int j = factorial(5);
        System.out.println(j);
    }

    public static int factorial(int n) {

        int i = 1;

        if (n != 0) {

            i = n * factorial(n-1);

        }

        return i;

    }

    public static boolean pattern(String str) {

        boolean result = false;
        boolean result1 = false;

        String s = null;

        if(str != "" && str.matches("^[a-zA-Z0-9]*$")) {

            if(str.length() > 8) {
                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) > '0' && str.charAt(str.length()-1) < '9' ) {

                        result1 = true;

                        return result1;

                    }
                }

                for(int i = 0; i < str.length(); i++) {

                }

            }

        }


        return result;
    }

}
