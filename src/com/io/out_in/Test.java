package com.io.out_in;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("t.txt"));
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        bos.flush();
        bos.close();
        bis.close();
        fis.close();
    }
}
