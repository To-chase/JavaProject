package com.io.out_in;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test4 {
    public static void main(String[] args) throws Exception{
//        save();
        get();
    }

    public static void save()throws Exception{
        Student student=new Student("amy",23);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("t.txt"));
        oos.writeObject(student);
        oos.close();
    }

    public static void get()throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("t.txt"));
        Student student=(Student) ois.readObject();
        System.out.println(student.getAge());
        System.out.println(student.getName());
        ois.close();
    }
}
