package com.fileio;

import java.io.*;

public class Writer {

    public static void main(String[] args) throws IOException {

        PrintWriter pr = new PrintWriter("remove.txt");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        BufferedReader br1 = null;
        boolean isAvailable;
        
        String line = br.readLine();
        
        while (line != null) {
            isAvailable = false;
            br1 = new BufferedReader(new FileReader("remove.txt"));
            String target = br1.readLine();
            do {
                if(line.equals(target)) {
                    isAvailable = true;
                    break;
                }
                target = br1.readLine();
            } while (target != null);

            if(isAvailable == false) {
                pr.println(line);
                pr.flush();
            }

            line = br.readLine();
        }
        br.close();
        br1.close();
        pr.close();
    }
    
}
