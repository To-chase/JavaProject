package com.client_servelt.test3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Server{
    public static void main(String[] args)throws Exception {
        Properties pro=new Properties();
        pro.load(Server.class.getResourceAsStream("/user.txt"));
        Set<String> keys=pro.stringPropertyNames();
        ServerSocket server=new ServerSocket(8006);
        Socket socket=server.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String user=br.readLine();
        String[] strs=user.split("=");
//        System.out.println(pro);
        int index=-1;
        for(String key:keys){
            String value=pro.getProperty(key);
            if(strs[0].equals(key)&&strs[1].equals(value)){
                index=1;
                break;
            }else if(strs[0].equals(key)&&!strs[1].equals(value)){
                index=0;
                break;
            }else{
                index=-1;
            }
        }
//        -------------------------------------------------------------
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        if(index==-1){
            FileOutputStream fs=new FileOutputStream("E:\\java\\JavaProject\\src\\user.txt",true);
            fs.write("\r\n".getBytes());
            fs.write(user.getBytes());
            fs.close();
            bw.write("注册成功");
            bw.newLine();
            bw.flush();
            bw.close();
        }else if(index==0){
            bw.write("密码错误");
            bw.newLine();
            bw.flush();
            bw.close();
        }else if(index==1){
            bw.write("登陆成功");
            bw.newLine();
            bw.flush();
            bw.close();
        }
        br.close();
    }
}
