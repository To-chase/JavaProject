package com.list.list;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
