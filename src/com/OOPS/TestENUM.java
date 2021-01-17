package com.OOPS;

import java.util.Arrays;

public enum TestENUM {
    SMALL("1"), MEDIUM("2"), LARGE("3"), EXTRALARGE("4");

    String i;

    TestENUM(String i) {
        this.i = i;
    }

    public String getValue() {
        return i;
    }

    public static TestENUM fromValues(String v) {
        for (TestENUM t : TestENUM.values()) {
            if (t.i.equals(v)) {
                return t;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

class TestE {

    public static void main(String[] args) {
//        System.out.println(TestENUM.SMALL.name());
//
//        TestENUM[] test = TestENUM.values();
//
//        System.out.println(Arrays.toString(test));
//
//        System.out.println(TestENUM.SMALL.getValue());

        //TestENUM.fromValues("1");

        t e = t.S;
        System.out.println(e.getValue());

    }

    enum t {
        S("1"), M("2"), L("3"), XL("4");

        private String v;

        t(String v) {
            this.v = v;
        }

        public String getValue() {
            return v;
        }
    }

}
