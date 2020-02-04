package com.theard.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mountains {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add("amy"+i);
        }

        Runnable r=new Runnable() {
            @Override
            public void run() {
              while(true){
                  synchronized (list){
                      if(list.size()==0){
                          System.out.println("全部人已经过完山洞");
                          break;
                      }
                      Random random=new Random();
                      int num=random.nextInt(list.size());
                      System.out.println("现在"+list.get(num)+"正在过山洞");
                      try {
                          Thread.sleep(2000);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }
                      list.remove(num);
                  }
              }
            }
        };
        Thread thread=new Thread(r);
        thread.start();
    }
}
