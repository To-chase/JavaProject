package com.reflect.test2;

public class User {
    public User(){

    }

    public void eat(){
        System.out.println("eat");
    }

    public void run(){
        System.out.println("run");
    }

    private void go(String name){
        System.out.println("go"+name);
    }
}
