package com.intro;

public class Main {

    public String field1 = "1";

    private static void main1(String[] args) {

        String welcome = "Hello World!";

        System.out.println(welcome);

        subString();

    }

    public static void main(String[] args) {


            //compound(2000, 5, .08, 12);

            //flip();

            //sort("1", "2", "3");

        loops(100);

    }

    private static  void compound(int pr, int t, double roi, int n) {
        double c = pr * Math.pow(1 + (roi / n), n * t);
        double cmp = c - pr;
        System.out.println("Compound Interest " + t + "" + cmp);
        System.out.println("Amount " + t + " " + c);

    }

    public static void flip() {

        String heads = "heads";

        String tails = "tails";

        if (Math.random() > 1) {
            System.out.println(tails);
        } else {
            System.out.println(heads);
        }

    }

    public static void loop() {


    }


    public static void loops(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
}





    public static void sort(String a, String b, String c) {

        int d = Integer.parseInt(a);
        int e = Integer.parseInt(b);
        int f = Integer.parseInt(c);

        if(f > d) {

            int g = f;
            f = e;
            e = d;

            System.out.println(g + "" + f + "" + e);

        }
    }

    public static void main2(String[] args) {

//        int a = 29;
//        int b =15;
//
//        a = b+a;
//
//        b = a-b;
//
//        a = a-b;
//
//        System.out.println("Value of b: " + b + "\n" +"Value of a: " + a);



        int a = 2004;



//        boolean c = (a%400==0 ) || (a%4==0 && a%100!=0);
//
//        boolean d = (b%400 == 0) && (a%100 != 0);
//
//        System.out.println("A is a leap year: " + c + "\n" + "b is a leap year: " + d);


        if(a%400 == 0) {
            if(a%100 != 0 && a%4 == 0) {
                System.out.println("Given year is a leap year");
            }
        } else {
            System.out.println("Given year is not a leap year");
        }


    }


    public static void subString() {

        String name = "123456789";

        String subString = name.substring(name.length() - 4);

        System.out.println(subString);

    }
}
