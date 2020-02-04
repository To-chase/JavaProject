package com.client_servelt.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Servlet {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器已启动,等待连接");
        ServerSocket server = new ServerSocket(8888);
        //等待连接
        Socket socket = server.accept();
        System.out.println("客户端已连接");
//        socket.close();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        String name="a.png";
        String path=getPath(name);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        byte[] b = new byte[1024];
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b,0,len);
        }
        bos.flush();
//        socket.shutdownOutput();
        OutputStream os=socket.getOutputStream();
        os.write("上传成功".getBytes());
        os.close();
        bis.close();
        socket.close();
    }

    public static String getPath(String name){
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String path=sf.format(date)+name;
        return path;
    }
}
