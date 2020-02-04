package com.date.test2;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        StringBuilder builder1=builder.append("hello");
        System.out.println("builder:"+builder);
        System.out.println("builder1:"+builder1);
        System.out.println(builder==builder1);
        System.out.println(builder.equals(builder1));
        System.out.println(builder.append("world").toString());
    }
}
