package com.String;

import java.util.*;

public class RemoveStringChars {

    public static void main(String[] args) {
        //System.out.println(getRemovedChars("Hello", false));
        //System.out.println(removeMatchedChars("Hello", "Hl"));
        //System.out.println(rotateString("hello", "hello"));
        //System.out.println(rotateString1("Hello", "lloHe"));
        System.out.println(reverseString("Hello"));
    }

    public static String getRemovedChars(String s, boolean isRequired) {

        String removedResult = "";
        String getRemoved = "";
        for (int i = 0; i < s.length(); i++) {
            if (!removedResult.contains(String.valueOf(s.charAt(i)))) {
                removedResult += String.valueOf(s.charAt(i));
            } else {
                getRemoved += String.valueOf(s.charAt(i));
            }
        }

        return isRequired ? removedResult : getRemoved;
    }

    public static String removeMatchedChars(String str1, String str2) {

        List<Character> result = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                result.add(str1.charAt(i));
            }
        }

        return String.valueOf(result);
    }

    public static boolean rotateString(String str1, String str2) {

        boolean result = true;

        if (str1.equals(str2)) {
            return result;
        }

        result = compareRotation(str1, str2);
        return result;
    }

    public static boolean compareRotation(String str1, String str2) {

        int retryAttempts = 0;
        int i = 0;
        char temp = 0;
        char[] c = str1.toCharArray();

        while (retryAttempts <= str1.length() - 1) {

            if (!(i == str1.length())) {

                if (i == 0) {
                    temp = c[i];
                }

                if (!(i == str1.length() - 1)) {
                    c[i] = c[i + 1];
                } else {
                    c[i] = temp;
                }

                if (str2.equals(String.valueOf(c))) {
                    return true;
                }
                i++;
            } else {
                i = 0;
                retryAttempts++;
            }
        }
        return false;
    }

    public static boolean rotateString1(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.length() == 0)
            return true;

        search:
        for (int s = 0; s < A.length(); ++s) {
            for (int i = 0; i < A.length(); ++i) {
                if (A.charAt((s + i) % A.length()) != B.charAt(i))
                    continue search;
            }
            return true;
        }
        return false;
    }

    public static String reverseString(String str) {

        char[] reverseStr = new char[str.length()];

        if (str.isEmpty()) {
            System.out.println("Given String is empty");
        }

        for (int i = 1; i <= str.length(); i++) {
            reverseStr[i - 1] = str.charAt(str.length() - i);
        }
        return new String(reverseStr);
    }

}
