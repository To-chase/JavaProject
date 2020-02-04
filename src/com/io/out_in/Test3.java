package com.io.out_in;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test3 {
    public static void main(String[] args) throws Exception{
        InputStreamReader ir=new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        char[] ch=new char[1024];
        int len;
        System.out.println((char) ir.read());
        System.out.println((char) ir.read());
        System.out.println((char) ir.read());
    }
}
