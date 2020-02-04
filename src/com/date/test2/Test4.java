package com.date.test2;

public class Test4 {
    public static void main(String[] args) {
        test1();
        test();
    }
    public static void test1(){
        StringBuffer builder=new StringBuffer();
        long start=System.currentTimeMillis();
        for (int i = 0; i <100000000 ; i++) {
            builder.append("world"+i);
        }
        long end=System.currentTimeMillis();
        System.out.println("StringBuffer用时:"+(end-start));
    }

    public static void test(){
        StringBuilder builder=new StringBuilder();
        long start=System.currentTimeMillis();
        for (int i = 0; i <100000000 ; i++) {
            builder.append("hello"+i);
        }
        long end=System.currentTimeMillis();
        System.out.println("StringBuilder用时:"+(end-start));
    }
}
