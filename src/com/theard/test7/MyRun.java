package com.theard.test7;

public class MyRun implements Runnable {
    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"教练来了");
        System.out.println("教练教完了,回去了");
    }
}
