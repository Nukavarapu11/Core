package com.OOPS;

public class Constructor {

    static String name;

   Constructor() {
       this(name);

    }

   Constructor(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Hello World: " + name);
        return name;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor("H");
        //System.out.println(c.name);

        Constructor c1 = new Constructor();
        //System.out.println(c1.name);
        System.out.println(c.getName());
        System.out.println(c1.getName());
    }

}

class C1 {

    int i;
    String j;

    public static void main(String[] args) {

        C1 c = new C1();
        System.out.println(c.i + c.j);

        Constructor c1 = new Constructor();
        c1.getName();

        test();

    }

    public static void test(){
        Constructor[] c2 = new Constructor[3];

        c2[0] = new Constructor("Helllo!");
        System.out.println(c2[0].getName());

    }
}


