package com.date.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args)throws Exception {
        System.out.println("请输入出生日期:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        Date date=df.parse(str);
        long brithday=date.getTime();
        Date date1=new Date();
        long today=date1.getTime();
        long life=today-brithday;
        if(life<0){
            System.out.println("你还没有出生！！！");
        }else {
            System.out.println("你出生了"+(life/1000/60/60/24/365)+"年");
        }
    }
}
