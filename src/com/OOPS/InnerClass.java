package com.OOPS;

public class InnerClass {

    String s1;
    String s2;

    InnerClass(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    private String getName() {
        return s1;
    }

    class Test1 {

        String s;

        Test1(String s) {
            this.s = s;
        }

        String getName() {
            return s;
        }

        public void getDetails() {
            if(InnerClass.this.getName().equals("Hello")) {
                if(InnerClass.this.s2.equals("World")) {
                    System.out.println("Welcome");
                } else {
                    System.out.println("Get Lost");
                }
            } else {
                System.out.println("Good Bye!");
            }
        }



    }

}

class Main5 {

    public static void main(String[] args) {

        InnerClass innerClass = new InnerClass("Hello", "World");

        InnerClass.Test1 inner = innerClass.new Test1("Hello!");

        System.out.println(inner.getName());

        inner.getDetails();
    }

}
