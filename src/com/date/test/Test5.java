package com.date.test;

import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        Calendar cle=Calendar.getInstance();
//        Date date=cle.getTime();
//        System.out.println(date);
        int year=cle.get(Calendar.YEAR);
        int month=cle.get(Calendar.MONTH)+1;
        int day=cle.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
        cle.add(Calendar.DAY_OF_MONTH,500);
         year=cle.get(Calendar.YEAR);
         month=cle.get(Calendar.MONTH)+1;
         day=cle.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
