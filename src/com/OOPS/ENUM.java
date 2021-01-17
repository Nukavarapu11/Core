package com.OOPS;

public enum ENUM {

    SMALL("1"),
        MEDIUM("2"),
            LARGE("3"),
                EXTRALARGE("4");

    private String s;

    ENUM(String s) {
        this.s = s;
    }

    public String getString() {
        return s;
    }

    public static ENUM fromValue(String str) {

        for(ENUM e : ENUM.values()) {
            if(e.s.equals(str)) {
                return e;
            }
        }

        throw new IllegalArgumentException(str);
    }

}
