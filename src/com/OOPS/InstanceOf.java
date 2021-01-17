package com.OOPS;

public class InstanceOf {

    public String s = "Hello";

    public static void main(String[] args) {

        InstanceOf i = new InstanceOf();

        System.out.println(i.s instanceof String);

        This t = new This();

        System.out.println(t instanceof This);

        Constructor c = new Constructor();

        System.out.println(c.getName());

    }
}
