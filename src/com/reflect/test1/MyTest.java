package com.reflect.test1;

@MyRuntil(name = "苹果",price=8000d)
public class MyTest {

    public String name;
    @MyRuntil(name = "联想",price = 40000d)
    private int age;
    @MyRuntil(name = "三星",price = 5000d)
    public void eat(){
        System.out.println("eat");
    }

    public void run(){
        System.out.println("run");
    }

}
