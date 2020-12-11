package com.intro;

public class Variables {

    String a;

    public void testLocal() {

        int i;
        i = 0;

        //should initialize the local variable
        System.out.println(i);
        System.out.println(a = "A");

    }

    public static void main(String[] args) {

        Variables var = new Variables();
        InstanceVariables instanceVariables = new InstanceVariables();
        InstanceVariables instanceVariables1 = new InstanceVariables();

        var.testLocal();
        //System.out.println(var.a = "A");

        System.out.println(instanceVariables.a = 1);
        System.out.println(instanceVariables.b = 2);
        System.out.println(instanceVariables.c = 3);

        System.out.println(instanceVariables1.a = 4);
        System.out.println(instanceVariables1.b = 5);
        System.out.println(instanceVariables1.c = 6);

        System.out.println(instanceVariables.a);
        System.out.println(instanceVariables1.a);

        System.out.println(InstanceVariables.d = 10);

    }

}
