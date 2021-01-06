package com.String;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringChars {

    public static void main(String[] args) {
        getRepeatedChar("HHHHHHeeeooololo");
    }

    public static void getRepeatedChar(String str) {

        char[] c = str.toCharArray();
        int j[] = new int[c.length];
        int count = 0;
        long start = System.currentTimeMillis();

        for (int i = 0; i < c.length - 1; i++) {
            for (int k = 0; k < c.length; k++) {
                if (c[i] == c[k]) {
                    j[k] = count + 1;
                }
                count = 0;
            }
        }
        int[] temp = j;
        Arrays.sort(temp);
        System.out.println(c[Arrays.binarySearch(j, temp[temp.length - 1])]);

        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }

}
