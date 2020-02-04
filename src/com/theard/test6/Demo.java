package com.theard.test6;

public class Demo {
    public static void main(String[] args) {
        Println println=new Println();
        new Thread(){
            @Override
            public void run() {
                try {
                    println.print();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    println.print2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    println.print3();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    public static void print2(){
        Show1 show1=new Show1();
        new Thread(){
            @Override
            public void run() {
                try {
                    show1.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    show1.show2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    show1.show3();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
    public static void print(){
        Show show=new Show();
        new Thread(){
            @Override
            public void run() {
                try {
                    show.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    show.show2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
