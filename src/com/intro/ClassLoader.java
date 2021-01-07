package com.intro;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassLoader {

    public static void main(String[] args) throws NoSuchMethodException {

        //object of Main created
        Main m1 = new Main();

        //getting the class
        Class c = m1.getClass();

        //printing the class name
        System.out.println(c.getName() + " " + c.getSimpleName() + " " + c.getCanonicalName() + " " + c.getTypeName());

        //getting all methods defined the main class
        Method[]  m = c.getDeclaredMethods();
        System.out.println(m);
//        for(Method method : m) {
//            System.out.println(" methods: " + method.getName());
//        }

        for (int i = 0; i<m.length; i++) {
            System.out.println(m[i].getName());
        }


        //getting all the declared variables
        Field[] f = c.getFields();

        for(Field field : f) {
            System.out.println("fields: " + field.getName());
        }

    }

}
