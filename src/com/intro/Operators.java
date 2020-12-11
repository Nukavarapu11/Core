package com.intro;

import com.sun.tools.javac.util.StringUtils;

public class Operators {

    static double a = 2;
    static int b = 10;

    public static void main(String[] args) {

        arithmaticOperators();
        //logicalOperators();
        //assignmentOperators();
        //relationalOperators();
        //bitWiseOperators();
        //instanceOf();

    }

    public static void arithmaticOperators() {

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }

    public static void logicalOperators() {

        if ((a > b) && (b < a)) {
            System.out.println("Test1");
        } else if ((a < b) || (b < a)) {
            System.out.println("Test2");
        } else if (!((a < 1) && (b > 5))) {
            System.out.println("Test");
        } else {
            System.out.println("Evaluation Failed");
        }

    }

    public static void assignmentOperators() {

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);

    }

    public static void relationalOperators() {

        String c = "AB";
        String d = "ab";

        if (c == d && a > b) {
            System.out.println("scenario1");
        } else if (c != d) {
            System.out.println("scenario2");
        } else if (b > a) {
            System.out.println("scenario3");
        } else if (a >= b || b >= a) {
            System.out.println("scenario4");
        } else {
            System.out.println("scenario5");
        }

    }

    public static void bitWiseOperators() {

        int a = 23;
        int b = 24;

        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a;
        int g = a << 2;
        int h = a >> 2;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }

    public static String instanceOf() {

        Car car = new Car();

        if (car instanceof Car) {

            car.setMake("Volvo");

            System.out.println(car.getMake());
        }
        return car.getMake();
    }

}
