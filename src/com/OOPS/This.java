package com.OOPS;

public class This {

    String s;
    int i;
    int j;
    int k;

    This() {
        //this.s = "Hi!";
        System.out.println(this);
    }

    This(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
        System.out.println(i+j+k);

        int m = add(this);
        System.out.println(m);
    }

    public This(int i, int j) {
        this(i,j,0);
    }

    public int add(This t) {
        t.i += 1;
        t.j += 2;
        t.k += 3;
        return i+j+k;
    }

    public static void main(String[] args) {

        This p = new This();
        System.out.println(p);
        boolean equals = p.equals(p);
        System.out.println(equals);
        This t3 = new This(1,2,3);
        This t4 = new This(1,2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        return false;
    }

    public void test(String s) {
        this.s = s;
    }

}
