package com.reflect.test2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {
    @Test
    public void test1() throws Exception {
        Class<Student> c=Student.class;
        Constructor[] constructors=c.getConstructors();
        Constructor[] constructors1=c.getDeclaredConstructors();
//        for(Constructor str:constructors1){
//            System.out.println(str);
//        }

        Constructor<Student> c1=c.getDeclaredConstructor(String.class);
        c1.setAccessible(true);
        Student student=c1.newInstance("马云");
        student.setName("小蜜蜂");
        System.out.println(student.getName());
    }

    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user=new User();
        Class c=user.getClass();
        Method[] m=c.getDeclaredMethods();
//        for(Method method:m){
//            System.out.println(method);
//        }
        Method method=c.getDeclaredMethod("go",String.class);
        method.setAccessible(true);
        method.invoke(user,"马云");
    }

    @Test
    public void test3() throws Exception {
        Class c=Class.forName("com.reflect.test2.Student");
        Field[] f=c.getDeclaredFields();
//        for(Field field:f){
//            System.out.println(field);
//        }
        Student student=new Student();
        Field f1=c.getDeclaredField("name");
        f1.setAccessible(true);
        f1.set(student,"马云");
        Object obj=f1.get(student);
        System.out.println(obj);
    }
}
