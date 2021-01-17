package com.OOPS;

public class MethodOverLoading {

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        int c = methodOverLoading.add(1, "c", 5);
        System.out.println(c);

        System.out.println(methodOverLoading.add(1.0,2.0));
    }

    public int add(int a, String b) {
        return a + Integer.parseInt(b);
    }

    public int add(int a, String b, int defaultValue) {
        try {
            return add(a, b);
        } catch (NumberFormatException ex) {
            System.out.println("error");
        }
        return defaultValue;
    }

    public double add(double a, double b) {
        return a + b;
    }

}
