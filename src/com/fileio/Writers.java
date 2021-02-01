package com.fileio;

import java.io.*;

public class Writers {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("output.txt");

        BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("Bar.txt"));

        String line = br.readLine();
        String line1 = br1.readLine();

        while (line != null || line1 != null) {

            if (line != null) {
                pw.println(line);
                line = br.readLine();
            }

            if (line1 != null) {
                pw.println(line1);
                line1 = br1.readLine();
            }

        }

        pw.flush();
        br.close();
        pw.close();

    }


}
