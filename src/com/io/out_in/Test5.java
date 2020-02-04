package com.io.out_in;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(97);
        System.out.println("world");
        PrintStream ps=new PrintStream("t.txt");
//        ps.print(true);
//        ps.print("\r\n");
//        ps.print(97);
//        ps.print("\r\n");
//        ps.print("hello");
//        ps.print("\r\n");
        System.setOut(ps);
        System.out.println(97);
        System.out.println("world");
    }
}
