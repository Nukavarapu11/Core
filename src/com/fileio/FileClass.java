package com.fileio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileClass {

    public static void main(String[] args) throws IOException {

        File f1 = new File("Foo");
        f1.mkdir();
        File f = new File(f1, "foo.txt");
        f.createNewFile();
        System.out.println(f.exists());

        if (f.exists()) {
            if (f.isFile()) {
                System.out.println("F object is a file");
            } else {
                System.out.println("F object is a directory");
            }
        }

        String[] list = f1.list();
        System.out.println(list.length);

        for(int i=0; i< list.length; i++) {
            File f4 = new File(f1, list[i]);
            System.out.println(list[i]);
            System.out.println(list[i].getBytes(StandardCharsets.UTF_8));
        }

        System.out.println(f.length());
        System.out.println(f.delete());
        System.out.println(f);

    }

}
