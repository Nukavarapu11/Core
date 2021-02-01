package com.Collections;

import java.util.*;

public class Lists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("R");
        list.add("A");
        list.add("V");
        list.add("I");

        List<String> list2 = new ArrayList<String>();

        list2.add("R");
        list2.add("A");
        list2.add("V");
        list2.add("A");

        System.out.println(list);

        Collections.sort(list2);
        int in = Collections.binarySearch(list2, "V");

        System.out.println(in);

        String indice = list.get(0);

        System.out.println(indice);

        boolean contains = list.contains("V");

        System.out.println(contains);

        ListIterator listIterator = list.listIterator();

        System.out.println(listIterator.toString());

        System.out.println(list.removeAll(list2));

        System.out.println(list);

        list.clear();

        System.out.println(list);

        Vector v = new Vector<String>();

        List l = new LinkedList();

        Set s = new HashSet<>();

        SortedSet s1 = new TreeSet();

        List lis = new Stack();

        List vector = new LinkedList();
        ((LinkedList) vector).getFirst();



    }



}
