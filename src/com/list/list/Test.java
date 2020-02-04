package com.list.list;

import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

    }
    public static void show1(){

    }
    public static void show(){
        Stack<String> stack=new Stack<>();//先进后出
        stack.push("a");
        stack.push("b");
        stack.push("c");
        for (String str:stack) {
            System.out.println(str);
        }
        System.out.println(stack.get(2));
    }
}
