package com.Arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraysPractice {

    public static void main(String[] args) {
        //missingNumber(new int[]{0, 1, 3, 4, 5});
        //duplicateNumber(new int[]{0, 1, 1, 2, 3, 4});
        getReqNumbers(new int[]{1, 29, 3, 5, 6,});
    }

    public static void missingNumber(int[] arr) {
        int length = arr.length;

        int totalCount = length * ((length + 1) / 2);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }

        int missingNumber = totalCount - count;

        System.out.println(missingNumber);
    }

    public static void duplicateNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int dup;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                dup = arr[i];
                System.out.println(dup);
            }
        }
    }

    public static void getReqNumbers(int[] arr) {
        //int pointer = 0;
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large)
                large = arr[i];

            if (arr[i] < small)
                small = arr[i];
        }
        System.out.println("small number: " + small + "\n" + "large number: " + large);
    }

}
