package com.reflect.test1;


import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {

    @Test
    public void test4()throws Exception{
        Class<MyDemo> c=MyDemo.class;
        MyDemo demo=c.newInstance();
        Method[] methods=c.getDeclaredMethods();
        for(Method m:methods){
            if(m.isAnnotationPresent(Mytil.class)){
                m.invoke(demo);
            }
        }

    }

    @Test
    public void test3() throws NoSuchFieldException {
        MyTest my=new MyTest();
        Class c=my.getClass();
        Field f=c.getDeclaredField("age");
        f.setAccessible(true);
        MyRuntil r=f.getAnnotation(MyRuntil.class);
        if(f.isAnnotationPresent(MyRuntil.class)){
            System.out.println(r.name());
            System.out.println(r.price());
        }
    }
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
        Class c=Class.forName("com.reflect.test1.MyTest");
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
