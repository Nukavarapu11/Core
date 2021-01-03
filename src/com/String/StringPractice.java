package com.String;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPractice {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //System.out.println(reverseString("Hello"));
//        String result = duplicateChars("Hello");
//        String[] dupResult = result.split("dup:");
//        System.out.println("result after removing duplicate char: " + dupResult[0] + System.lineSeparator() + "duplicate char: " + dupResult[1]);
        //System.out.println(anagramStrings("hello", "heloo"));
        //test();
        //System.out.println(numbersInString("12345p"));
        //System.out.println(getVowelsAndConsCount("aeiou"));
        //System.out.println(getGivenCharCount("skkimp", 'a'));
        //System.out.println(getFirstNonRepString("HHeelloo"));
        //test1();
        //System.out.println(atoi("-1"));
        //System.out.println(reverseStringWL("Hello"));
        //System.out.println(stringRotation("Hello", "loHel"));
        //System.out.println(compareRotation("Hello", "loHel"));
        //System.out.println(isPalindrome("lolol"));
        //System.out.println(getLargestSubString("GEEKSFORGEEKS"));
        //System.out.println(getNonRepeatedSubStringLen("Hello"));
        //System.out.println(byteToString(new byte[]{1, 66, 2, 3, 5, 4}));
        //System.out.println(removeDups("Hello"));
        //System.out.println(maxOccuringChar("HHeeHHHeeloooe"));
        //System.out.println(removeChar("Hello", 'l'));
        //System.out.println(repeatedString(new String[]{"h", "h", "e", "e", "l", "l", "o", "o"}));
        //System.out.println(getAsciiValue("Hello"));
        System.out.println(getRepeatedString(new String[] {"Hello", "Geeks", "World", "Hello", "Geeks", "Hello"}));

    }

    public static String reverseString(String str) {

        char[] reverseString = new char[str.length()];

        if (!str.isEmpty()) {
            for (int i = str.length(); i > 0; i--) {
                reverseString[(str.length()) - i] = str.charAt(i - 1);
            }
        }
        return String.valueOf(reverseString);
    }

    public static String duplicateChars(String str1) {
        String result;
        String deDup = "";
        String dup = "dup: ";
        int i;
        for (i = 0; i < str1.length(); i++) {
            if (!deDup.contains(String.valueOf(str1.charAt(i)))) {
                deDup = deDup + str1.charAt(i);
            } else {
                dup = dup + str1.charAt(i);
            }
        }
        result = deDup + dup;
        return result;
    }

    public static boolean anagramStrings(String str1, String str2) {

        boolean result;

        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        result = Arrays.equals(c1, c2);

        return result;

    }

    public static void test() {
        String s = "     -42";

        System.out.println(s.trim());
    }

    public static boolean numbersInString(String str) {

        boolean result;
        int k = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) >= 48 && str.codePointAt(i) <= 57) {
                ++k;
            }
        }

        result = k == str.length() ? true : false;
        return result;

    }

    public static String getVowelsAndConsCount(String s) {

        String result;
        int vowels = 0;

        char[] c = s.toLowerCase().toCharArray();
        char[] v = {'a', 'e', 'i', 'o', 'u'};

        //65-90(UC) - 97-122(LC)
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                for (int j = 0; j < v.length; j++) {
                    if (c[i] == v[j])
                        vowels++;
                }
            }
        }

        result = "Vowels: " + vowels + "\n" + "Consonants: " + (s.length() - vowels);
        return result;
    }

    public static int getGivenCharCount(String str, char c) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static char getFirstNonRepString(String s) {
        char c = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> map1 : map.entrySet()) {
            if (map1.getValue() == 1) {
                c = map1.getKey();
                return c;
            }

        }
        return c;
    }

    public static void test1() {

        String s = "HHello";
        char c = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < s.length(); j++) {
            if (map.get(s.charAt(j)) == 1) {
                c = s.charAt(j);
                System.out.println(c);
                break;
            }
        }
    }

    public static int atoi(String s) {
        int result = 0;
        int i = 0;

        if (!s.isEmpty()) {
            s = s.trim();
            boolean negCase = s.startsWith("-");
            s = negCase ? s.substring(1) : checkForSpecialChars(s);
            boolean checkStr = s.isEmpty() ? false : s.charAt(i) >= 48 && s.charAt(i) <= 57;
            if (checkStr) {
                while (i < s.length()) {
                    if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                        char digit = s.charAt(i);
                        result = checkForMaxValue(result * 10 + digit - '0');

                        if (result == Integer.MAX_VALUE) {
                            return negCase ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                        }
                    } else {
                        break;
                    }
                    i++;
                }
                if (negCase) {
                    result = -result;
                }

            }
        }
        return result;
    }

    private static String checkForSpecialChars(String s) {
        Pattern pattern = Pattern.compile("[^0-9a-zA-Z]");
        Matcher match = pattern.matcher(String.valueOf(s.charAt(0)));

        s = match.matches() ? s.substring(1) : s;

        return s;
    }

    private static int checkForMaxValue(int result) {
        if (result > Integer.MAX_VALUE / 10) {
            result = Integer.MAX_VALUE;
        }
        return result;
    }

    public static String reverseStringWL(String str) {
        char[] temp = new char[str.length()];
        char[] c = str.toCharArray();

        for (int i = str.length(); i > 0; i--) {
            temp[str.length() - i] = c[i - 1];
        }
        return String.valueOf(temp);
    }

    public static boolean stringRotation(String s1, String s2) {

        char[] c = s1.toCharArray();
        int retryAttempts = 0;
        char temp = 0;

        while (retryAttempts <= c.length) {

            for (int i = 0; i < c.length; i++) {

                if (i == 0) {
                    temp = c[i];
                }

                if (i == c.length - 1) {
                    c[i] = temp;
                } else {
                    c[i] = c[i + 1];
                }

                if (new String(c).equals(s2)) {
                    return true;
                }
            }
            //s1 = new String(c);
            retryAttempts++;
        }
        return false;
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

    public static boolean isPalindrome(String s) {
        boolean isPalindrome;
        char[] temp = s.toCharArray();

        for (int i = 1; i <= s.length(); i++) {
            temp[i - 1] = s.charAt(s.length() - i);
        }
        isPalindrome = new String(temp).equals(s) ? true : false;

        return isPalindrome;
    }

    public static String getLargestSubString(String s) {
        String temp = null;

        Map<String, Integer> subString = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String chars = "";
            temp = s.substring(i);

            for (int j = 0; j < temp.length(); j++) {

                if (!chars.contains(String.valueOf(temp.charAt(j)))) {
                    chars = chars + temp.charAt(j);
                }
            }

            if (temp.length() == chars.length()) {
                subString.put(chars, chars.length());
            }
            if (!subString.isEmpty()) {
                int maxValue = Collections.max(subString.values());

                for (Map.Entry<String, Integer> entrySet : subString.entrySet()) {
                    if (entrySet.getValue() == maxValue) {
                        return entrySet.getKey();
                    }
                }
            }
        }
        return null;
    }

    public static int getNonRepeatedSubStringLen(String s) {
        Set<Character> hashSet = new HashSet<>();

        int a = 0;
        int b = 0;
        int max = 0;

        while (b < s.length()) {
            if (!hashSet.contains(s.charAt(b))) {
                hashSet.add(s.charAt(b));
                b++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(a));
                a++;
            }
        }
        return max;
    }

    public static String byteToString(byte[] b) throws UnsupportedEncodingException {
        char[] temp = new char[b.length];

        for (int i = 0; i < b.length; i++) {
            temp[i] = (char) b[i];
        }
        System.out.println(temp);

//        char c = 65;
//        System.out.println(c);

        return new String(temp);
    }

    public static String removeDups(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(String.valueOf(s.charAt(i)))) {
                result = result + s.charAt(i);
            }
        }
        return result;
    }

    public static char maxOccuringChar(String s) {
        char result = 0;
        List<Integer> temp = new ArrayList<>();
        int charCount = 0; //1

        if (!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    //if (!(i == j)) {
                    if (s.charAt(i) == s.charAt(j)) {
                        charCount = charCount + 1;
                    }
                    //}
                }
                temp.add(charCount);
                charCount = 0; //1
            }

            int indice = temp.indexOf(Collections.max(temp));
            result = s.charAt(indice);
            return result;
        }
        return result;
    }

    public static String removeChar(String s, char c) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                result = result + s.charAt(i);
            }
        }
        return result;
    }

    public static String getRepeatedString(String[] str) {

        String result = "";
        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 1;
        int lex = 0;

        compareArrayIndices(str, map, count);

        result = getString(result, map, lex);

        return result;
    }

    private static String getString(String result, Map<String, Integer> map, int lex) {
        for (Map.Entry<String, Integer> entrySet : map.entrySet()) {

            if (entrySet.getValue() >= lex) {
                if (!(lex == entrySet.getValue())) {
                    result = entrySet.getKey();
                } else {
                    result = getAsciiValue(result) < getAsciiValue(entrySet.getKey()) ? result : entrySet.getKey();
                }
            }
            lex = entrySet.getValue();
        }
        return result;
    }

    private static void compareArrayIndices(String[] str, Map<String, Integer> map, int count) {

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (!(i == j)) {
                    if (str[i].equals(str[j])) {
                        count = count + 1;
                        map.put(str[i], count);
                    }
                }
            }
            count = 1;
        }
    }

    private static int getAsciiValue(String temp) {
        int ascii = 0;

        for (int i = 0; i < temp.length(); i++) {
            ascii = ascii + temp.charAt(i);
        }
        return ascii;
    }

}


