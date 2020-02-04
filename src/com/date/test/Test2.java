package com.date.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
        String str=df.format(date);
//        System.out.println(str);
        DateFormat dfs=new SimpleDateFormat("yyyy年MM月dd日");
        String strs="2020年2月3日";
        try {
            Date date1=dfs.parse(strs);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
