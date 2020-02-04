package com.date.test2;

public class Test3 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=sb.append("world");
        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));
    }
}
