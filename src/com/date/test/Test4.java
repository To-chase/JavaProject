package com.date.test;

import java.util.Calendar;

public class Test4 {
    public static void main(String[] args) {
        Calendar cd=Calendar.getInstance();
//        cd.set(Calendar.YEAR,2021);
        cd.add(Calendar.DAY_OF_MONTH,2);
        cd.add(Calendar.YEAR,-5);
        int year=cd.get(Calendar.YEAR);
        int month=cd.get(Calendar.MARCH)+1;
        int day=cd.get(Calendar.DAY_OF_MONTH);
//        System.out.println(year+"年"+month+"月"+day+"日");
        System.out.println(year+"年"+month+"月"+day+"日");

        System.out.println(year+"年"+month+"月"+day+"日");

    }
}
