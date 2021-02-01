package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Ravi", 1));
        list.add(new Employee("Nukavarapu", 2));

        new ListTest().getEmployeeObj(list);

        Employee obj = list.get(1);
        System.out.println(obj.getName());
        String name = obj.getName();
        System.out.println(list.contains(obj));
        System.out.println(list.remove(obj));
        System.out.println(list);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            Employee em = (Employee) itr.next();
            if(em.getName().equals("Ravi")) {
                System.out.println("1");
            }
        }

        list.removeAll(list);
        System.out.println(list);

    }

    public List<Employee> getEmployeeObj(List list) {
        System.out.println(list);
        return list;
    }

}
