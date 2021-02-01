package com.Collections;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class SetTest {

    Company company;

    public static void main(String[] args) {

        TreeSet<Company> ts = new TreeSet<>(new Sorting());
        ts.add(new Company("Google", 100000, 26, "Technology", "Search-Engine"));
        ts.add(new Company("Microsoft", 89500, 59, "Technology", "Operating-System"));
        ts.add(new Company("Amazon", 2250000, 104, "Technology", "E-Commerce"));
        ts.add(new Company("Apple", 170000, 15, "Technology", "Electronics"));
        ts.add(new Company("Apple", 170000, 15, "Technology", "Electronics"));

        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.comparator());

    }

}
