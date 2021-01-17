package com.OOPS;

public class Reflection {

    public String name;
    private int num;

    public Reflection(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private String get(String name) {
        return name;
    }

    public String name(String name) {
        return this.name;
    }

}
