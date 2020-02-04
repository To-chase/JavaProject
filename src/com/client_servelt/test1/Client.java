package com.client_servelt.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket client=new Socket("localhost",9999);
        while(true){
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            Scanner sc=new Scanner(System.in);
            System.out.print("客户端:");
            String msg=sc.next();
            bw.write(msg);
            bw.newLine();
//            client.shutdownOutput();
            if("end".equals(msg)){
                System.out.println("客户端自身想结束谈话");
                bw.close();
                client.close();
                return;
            }
            bw.flush();
//            -------------------------
            BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            String message=br.readLine();
            if("end".equals(message)){
                System.out.println("客户端接到服务端的结束请求");
                br.close();
                client.close();
                return;
            }
            System.out.println("服务端"+message);
        }
    }
}
