package com.OOPS;

public class ClassAndObject {

    public static String s = "Hello";

    public void method() {
        System.out.println("Hello1" + s);
    }

}

class C2 {

    public static void main(String[] args) {
        ClassAndObject classAndObject = new ClassAndObject();

        classAndObject.s = "Hello1";
        classAndObject.method();

        ClassAndObject classAndObject1 = new ClassAndObject();
        classAndObject1.s = "Hello2";
        classAndObject1.method();

        System.out.println(classAndObject.s);

    }
}
