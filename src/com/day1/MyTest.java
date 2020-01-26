package com.day1;

@MyRuntil(name = "苹果",price=8000d)
public class MyTest {
    @MyRuntil(name = "三星",price = 5000d)
    public void eat(){
        System.out.println("eat");
    }

    public void run(){
        System.out.println("run");
    }
}
