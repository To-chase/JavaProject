package com.client_servelt.test3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket client=new Socket("localhost",8006);
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username=sc.next();
        System.out.print("请输入密码:");
        String password=sc.next();
        String user=username+"="+password;
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        bw.write(user);
        bw.newLine();
        bw.flush();
//        -----------------
        BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
        String message=br.readLine();
        System.out.println(message);
        br.close();
        bw.close();
    }
}
