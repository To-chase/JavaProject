package com.day1;


import org.junit.Test;

import java.lang.reflect.Method;

public class Test1 {
    @Test
    public void test1(){
        Class<MyTest> c=MyTest.class;
        MyRuntil runtil=c.getAnnotation(MyRuntil.class);
        if(c.isAnnotationPresent(MyRuntil.class)){
            System.out.println("名字:"+runtil.name());
            System.out.println("名字:"+runtil.price());
        }
    }

    @Test
    public void test2() throws Exception{
        Class c=Class.forName("com.day1.MyTest");
        Method m=c.getDeclaredMethod("run");
        MyRuntil runtil=m.getAnnotation(MyRuntil.class);
        if(m.isAnnotationPresent(MyRuntil.class)){
            System.out.println(runtil.name());
            System.out.println(runtil.price());
        }else{
            System.out.println("该方法没有注解");
        }
    }
}
