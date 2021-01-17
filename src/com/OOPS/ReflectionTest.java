package com.OOPS;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Reflection reflection = new Reflection("Hello", 1);

        Class c = reflection.getClass();

        System.out.print(c.getCanonicalName() + " " + c.getName() + " " + c.getClassLoader() + "\n");

        Method[] methods = c.getMethods();

        for(Method m : methods) {
            System.out.print("Methods: " + m.getName() + " " + m.getReturnType() + " " + m.getParameters() + "\n");
        }

        Field[] fields = c.getDeclaredFields();

        for(Field f : fields) {
            System.out.print("Fields: " + f);
        }

        Constructor[] constructors = c.getConstructors();

        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "" + constructor.getParameterTypes() + "" + constructor.getModifiers());
        }

        Method getMethod = c.getMethod("getNum");

        System.out.println(getMethod);

        Object obj = getMethod.invoke(reflection);

        System.out.println("Object: " + obj);

        Method prvMethod = c.getDeclaredMethod("get", String.class);

        prvMethod.setAccessible(true);

        Object o = prvMethod.invoke(reflection, "Ravi");

        System.out.println("O: " + o);

        String pvtReturn = (String) prvMethod.invoke(reflection, "Ravi");

        System.out.println(pvtReturn);

        Method stringMethod = c.getMethod("name", String.class);

        String name = (String) stringMethod.invoke(reflection, "");

        System.out.println(name);

    }

}
