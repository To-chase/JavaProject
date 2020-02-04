package com.theard.test3;

public class Car {
    public static void main(String[] args) {
        int seat=80;
        Runnable r=new Runnable() {
            int index=1;
            @Override
            public void run() {
                while(true){
                    synchronized (this){
                        if(index>80){
                            System.out.println("该班车已没有位置");
                            break;
                        }
                        int num=80-index;
                        if(num>0){
                            System.out.println(Thread.currentThread().getName()+",还剩"+num+"个座位");
                        }else {
                            System.out.println(Thread.currentThread().getName()+",已没有座位");
                        }
                        index++;
                    }
                }
            }
        };
        Thread t1=new Thread(r,"前门上车");
        Thread t2=new Thread(r,"中间门上车");
        Thread t3=new Thread(r,"后门上车");
        t1.start();
        t2.start();
        t3.start();
    }
}
