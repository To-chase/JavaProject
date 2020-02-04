package com.client_servelt.test;


import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost", 8888);
        System.out.println("正在上传图片");
        FileInputStream fis = new FileInputStream("E:\\学科\\大一\\zhiye.png");
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        bos.flush();
        client.shutdownOutput();

        InputStream is=client.getInputStream();
        byte[] back=new byte[1024];
        int lens=is.read(back);
        System.out.println(new String(back));
        is.close();
        fis.close();
        client.close();
    }
}
