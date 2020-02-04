package com.theard.test6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Println {
//    创建锁对象
    ReentrantLock lock=new ReentrantLock();
//    创建监视器
    Condition c1;
    Condition c2;
    Condition c3;
    public Println(){
        c1=lock.newCondition();
        c2=lock.newCondition();
        c3=lock.newCondition();
    }
    int count=1;
    public void print()throws Exception{
        for (int i = 0; i <30 ; i++) {
            lock.lock();
            while (count!=1){
                c1.await();
            }
            Thread.sleep(1000);
            System.out.println("我是中国人");
            count=2;
            c2.signal();
            lock.unlock();
        }
    }

    public void print2()throws Exception{
        for (int i = 0; i <30 ; i++) {
            lock.lock();
            while (count!=2){
                c2.await();
            }
            Thread.sleep(1000);
            System.out.println("犯我中华者");
            count=3;
            c3.signal();
            lock.unlock();
        }
    }

    public void print3()throws Exception{
        for (int i = 0; i <30 ; i++) {
            lock.lock();
            while (count!=3){
                c3.await();
            }
            Thread.sleep(1000);
            System.out.println("虽远必诛");
            count=1;
            c1.signal();
            lock.unlock();
        }
    }
}
