package com.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loops {

    public static void main(String[] args) {

        //triangle(7);
        //System.out.println(printARightTriangle(8));
//        System.out.println("A");
//        System.out.println(System.lineSeparator());
//        System.out.println("B");

//        System.out.println("A");
//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.append("*"));
        //isoscelesTriangle();
//        int[] a = new int[]{0, 1, 2, 3, 4};
//        array(a);
        //list();
        string();
    }

    public static String printARightTriangle(int N) {
        StringBuilder result = new StringBuilder();
        for (int r = 0; r < N; r++) {
            for (int j = 0; j < r; j++) {
                result.append("*");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static String triangle(int i) {

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; j++) {
            for (int k = i; k > j; k--) {
                System.out.print(sb.append("*"));
            }
            System.out.print("\n");

        }
        return sb.toString();
    }

    public static String isoscelesTriangle() {

        StringBuilder sb = new StringBuilder();
        int i = 8;
        int j, k, l;

        for (j = 1; j < i; j++) {

            for (k = i; k > j; k--) {
                System.out.print(" ");
            }

            for (l = i; l > k - 1; l--) {
                System.out.println("* ");
            }

            System.out.println(System.lineSeparator());

        }

        return sb.toString();
    }

    public static List<Integer> array(int[] a) {

        List<Integer> i = new ArrayList<>();

        for (int j = 0; j < a.length; j++) {
            i = Arrays.asList(a[j]);
            System.out.print(i);
        }
        return i;
    }

    public static void list() {
        int i = 0;
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        for (i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public static void string() {

        String s = "helloworld!";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(s.length() - i - 1));
        }

    }

}