package com.theard.test2;

public class Buy {
    public static void main(String[] args) {
        int num=100;
        Runnable r=new Runnable() {
            int index=1;
            @Override
            public void run() {
              while(true){
                  synchronized (this){
                      if(index>100){
                          System.out.println("水杯已卖完");
                          break;
                      }
                      int number=100-index;
                      if(number>0){
                          System.out.println(Thread.currentThread().getName()+"买出第"+index+"个,"+"剩余"+number+"个");
                      }else{
                          System.out.println(Thread.currentThread().getName() + "买出第" + index + "个,没有库存");
                      }
                      index++;
                  }
              }
            }
        };

        Thread thread=new Thread(r,"实体店");
        Thread thread1=new Thread(r,"官网");
        thread.start();
        thread1.start();
    }
}
