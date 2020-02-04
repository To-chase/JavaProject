package com.theard.test7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        MyRun r=new MyRun();
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);
    }
}
