package com.OOPS;

import java.util.ArrayList;
import java.util.List;

public class Methods {

    public static void main(String[] args) {
        Methods methods = new Methods();

        int a = 2;
        List<Integer> list = new ArrayList<>();
        methods.method1(a, list);
        System.out.println(list);

        List<Integer> list1 = methods.method2(3);
        System.out.println(list1);
    }

    public void method1(int a, List<Integer> b) {
        a = a * a;
        b.add(a);
    }

    public List<Integer> method2(int a) {
        int b = a * a;
        List<Integer> list = new ArrayList<>();
        list.add(b);
        return list;
    }

}
