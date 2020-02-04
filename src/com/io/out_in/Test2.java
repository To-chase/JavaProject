package com.io.out_in;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String patn = System.currentTimeMillis() + ".txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(patn));
        char[] ch = new char[1024];
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
