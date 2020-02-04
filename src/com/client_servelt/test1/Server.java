package com.client_servelt.test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws Exception{
        System.out.println("服务器启动，等待连接");
        ServerSocket server=new ServerSocket(9999);
        Socket socket=server.accept();
        while(true){
//            System.out.println("连接成功");
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String meg=br.readLine();
            if("end".equals(meg)){
                System.out.println("服务器接到客户端的结束请求");
                br.close();
                socket.close();
                return;
            }
            System.out.println("客户端"+meg);
//            --------------------------
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            Scanner sc=new Scanner(System.in);
            System.out.print("服务端:");
            String message=sc.next();
            bw.write(message);
            bw.newLine();
            if("end".equals(message)){
                System.out.println("服务端自身结束谈话");
                bw.close();
                socket.close();
                return;
            }
            bw.flush();
        }

    }
}
