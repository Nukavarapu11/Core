package com.intro;

import java.util.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Loop {

    public static void main(String[] args) {
        //numbers();
        //natualNumbers();
        //multiples();
        //factorialValues();
        //fc();
        //exponentialPowers();
        //num();
        //reverseInteger();
        //reverseInt();
        //evenOdd();
        //odd();
        //prime();
        //doWhile();
        //count();
        //minMax();
        //fibonacciNumbers();
        //armStrong();
        //series();
        //algo1();
        //algo();
        //randomNumber();
        //rectangle();
        //rightAngledTriangle();
        //reverseRightAngled();
        //algo();
        //algo1();
        //algo();
        //halfPyramid();
        //pyramid();
        pyramidWNum();
    }

    public static String[] numbers() {
        String str[] = new String[11];
        for (int i = 0; i <= 10; i++) {
            str[i] = String.valueOf(i);
            System.out.println(str[i]);
        }
        System.out.println(str);
        for (int i = 0; i < str.length; i++) {
            System.out.print(Arrays.asList(str[i]));
        }
        return str;
    }

    public static int natualNumbers() {
        int j = 0;

        for (int i = 1; i <= 10; i++) {
            j = i + i;
        }
        System.out.println(j);
        return j;
    }

    public static void multiples() {

        Scanner sc = new Scanner(System.in);

        int j = sc.nextInt();

        if (j % 2 == 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j * i);
            }
        } else {
            System.out.println("Input is not an even number");
        }
    }

    public static void factorialValues() {

        Scanner sc = new Scanner(System.in);

        int j = sc.nextInt();

        int k = 1;

        for (int i = 1; i <= j; i++) {

            k = k * i;
        }
        System.out.println(k);

    }

    public static void exponentialPowers() {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int j = sc.nextInt();
        int k = sc.nextInt();

        int p = 1;

        for (int i = 1; i <= j; i++) {

            p = p * k;

        }
        System.out.println(p);
    }

    public static void reverseInteger() {

        int i = 234;

        int reverse = 0;

        while (i > 0) {
            reverse = reverse * 10 + i % 10;
            i /= 10;
        }
        System.out.println(reverse);
    }

    public static void reverseInt() {

        int i = 2333331;

        int reverse = 0;

        for (; i != 0; i = i / 10) {

            reverse = reverse * 10 + (i % 10);
        }

        System.out.println(reverse);

    }

    public static void evenOdd() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int j = 0;
        int k = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                j = j + list.get(i);
            } else {
                k = k + list.get(i);
            }
        }
        System.out.println("Sum of Even: " + j);
        System.out.println("Sum of Odd: " + k);

    }

    public static void odd() {
        Scanner console = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void prime() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();

        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag && number > 1) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static void doWhile() {

        {
            Scanner console = new Scanner(System.in);

            int number1, number2;
            char choice;

            do {
                System.out.print("Enter the first number ");
                number1 = console.nextInt();

                System.out.print("Enter the second number ");
                number2 = console.nextInt();

                int sum = number1 + number2;
                System.out.println("Sum of numbers: " + sum);

                System.out.print("Do you want to continue y/n? ");
                choice = console.next().charAt(0);

                System.out.println();

            } while (choice == 'Y' || choice == 'y');
        }
    }

    public static void count() {

        Scanner sc = new Scanner(System.in);

        String s;
        char userChoice;

        do {
            int j = 0;
            int k = 0;
            int q = 0;
            System.out.println("Enter Comma separated values: ");
            s = sc.next();
            //s = sc.nextLine();
            String[] str = s.split(",");

            for (int i = 0; i < str.length; i++) {
                if (str[i] != null && Integer.parseInt(str[i]) > 0) {

                    j++;
                } else if (str[i] != null && Integer.parseInt(str[i]) < 0) {
                    k++;
                } else if (str[i] != null && Integer.parseInt(str[i]) == 0) {
                    q++;
                } else {
                    System.out.println("Enter Values");
                }

            }

            System.out.println("Positive Numbers Count: " + j);
            System.out.println("Negative Numbers Count: " + q);
            System.out.println("Zeros Count: " + k);

            System.out.println("Do you wish to continue Y/N: ");

            userChoice = sc.next().charAt(0);

            System.out.println("Users Choice: " + userChoice);

        } while (userChoice == 'Y' || userChoice == 'y');

    }

    public static void minMax() {

        Scanner input = new Scanner(System.in);

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        char choice;

        do {
            System.out.println("Enter Number");
            int number = input.nextInt();

            if (number > maximum)
                maximum = number;

            if (number < minimum)
                minimum = number;

            System.out.println("Do you wish to continue Y/N");
            choice = input.next().charAt(0);
            System.out.println("Users choice: " + choice);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Maximum Number: " + maximum);
        System.out.println("Minumum Number: " + minimum);

    }

    public static void fibonacciNumbers() {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int init = 0;

        int secondValue = 1;

        int fib = 0;

        int[] arr = new int[number];

        System.out.print("fibanocci: " + init + "," + secondValue);

        arr[0] = init;

        arr[1] = secondValue;

        for (int i = 2; i < number; i++) {

            fib = init + secondValue;

            init = secondValue;

            secondValue = fib;

            arr[i] = fib;

        }

        System.out.println("Fib Array: " + Arrays.toString(arr));

        System.out.println("Length of an Array: " + arr.length);

    }

    public static void armStrong() {

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;

        for (int i = 1; i <= 500; i++) {

            int t = i;
            d1 = t % 10;

            t = t / 10;
            d2 = t % 10;

            t = t / 10;
            d3 = t % 10;

            if (d1 * d1 * d1 + d2 * d2 * d2 + d3 * d3 * d3 == i) {
                System.out.println("Given number is an Armstrong! " + i);
            }
        }

    }

    public static void series() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the positive value");

        int i = sc.nextInt();

        double result = 0;

        for (int j = 1; j < i; j++) {

            result = result + (1 / j);
        }

        System.out.println("Sum of the series: " + result);

    }

    public static void algo() {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        double result = 1;

        double sign = -1;

        for (int j = 2; j <= i; j++) {

            result = result + (sign / j);

            sign *= -1;
        }

        System.out.println(result);
    }

    public static void algo1() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        double sum = 0;
        int sign = 1;

        for (int i = 1; i <= number; i++) {

            sum += (1.0 * sign) / i;
            sign *= -1;
        }

        System.out.println("log2: " + sum);

    }

    public static void randomNumber() {

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int j = 0;

        do {
            i = ThreadLocalRandom.current().nextInt();

            System.out.println("Enter a number");
            j = sc.nextInt();

            if (j > i) {
                System.out.println("Higher than generated, try again");

            } else if (j < i) {
                System.out.println("Lower than generated, try again");

            } else if (i == j) {
                System.out.println("You're right!");

            }

        } while (i != j);

    }

    public static void rectangle() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }

    }

    public static void rightAngledTriangle() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    public static void reverseRightAngled() {

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    public static void halfPyramid() {

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    public static void pyramid() {

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    public static void pyramidWNum() {

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + i) + 1; k++) {
                System.out.print(i + 1);
            }
            System.out.println("\n");
        }

    }

}



