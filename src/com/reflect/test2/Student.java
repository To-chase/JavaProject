package com.reflect.test2;

public class Student {
    private String name;
    private Integer age;
    private String sex;
    public String adress;

    public Student(){
        System.out.println("我是无参构造器---->public");

    }

    private Student(String name){
        System.out.println("我是有参构造器---->private"+name);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
