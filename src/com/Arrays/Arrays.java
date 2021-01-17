package com.Arrays;

import java.util.Collections;
import java.util.List;

public class Arrays {

    public static void main(String[] args) {
        //test();
        //asList();
        compare();
    }

    public static void test() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);

        int[] arr1 = new int[6];
        arr1[1] = 2;
        System.out.println(arr1[1]);

        int[] arr2;
        arr2 = new int[7];
        arr2[2] = 3;

        System.out.println(arr2[2]);

        java.util.Arrays.fill(arr, 7);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static List<Integer> asList() {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(arr));
        return java.util.Arrays.asList(arr);
    }

    public static void compare() {
        int[] arr = {10, 20, 15, 22, 35};
        int[] arr1 = {10, 15, 22};

        java.util.Arrays.asList(arr);


        System.out.println(java.util.Arrays.compare(arr, arr1));

    }

}
