package com.date.test;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.getTime());
        System.out.println(new Date(0L).getTime());
    }
}
