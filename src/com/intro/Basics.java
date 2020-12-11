package com.intro;

public class Basics {

    public static void main(String[] args) {

        Double b = Double.parseDouble(args[0]);
        Double c = Double.parseDouble(args[1]);

        Double disc = b * b - 4.0 * c;

        Double sqrt = Math.sqrt(disc);

        Double quadratic = (-b + sqrt) / 2;
        Double quad2 = (-b - sqrt) / 2;

        System.out.println(quadratic);
        System.out.println(quad2);

    }

}
