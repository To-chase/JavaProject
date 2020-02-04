package com.theard.test4;

public class Ticket {
    public static void main(String[] args) {

    int ticket=20;
    Runnable r=new Runnable() {
        int index=1;
        @Override
        public void run() {
         while(true){
             synchronized (this) {
                 if (index > 20) {
                     System.out.println("火车票已卖完");
                     break;
                 }
                 int num = 20 - index;
                 if (num > 0) {
                     System.out.println("窗口:" + Thread.currentThread().getName() + "已售了一张票,剩余票数为" + num);
                 } else {
                     System.out.println("窗口:" + Thread.currentThread().getName() + "已售了最后一张票");
                 }
                 index++;
             }
         }
        }
    };
    Thread t1=new Thread(r,"广州南");
    Thread t2=new Thread(r,"深圳北");
    Thread t3=new Thread(r,"佛山南");
    Thread t4=new Thread(r,"天河客运站");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    }

}
