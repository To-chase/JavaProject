package com.io.file;

import java.io.File;

public class PrintDir {
    public static void main(String[] args) {
        File file=new File("E:\\a");
//        print(file);
        print1(file);
    }

    public static void print(File file){
        if(!file.exists()){
            System.out.println("该文件不存在！！！");
        }else {
            File[] files=file.listFiles();
            for(File f:files){
                if(f.isFile()){
                    System.out.println(f.getPath());
                }else {
                    print(f);
                }
            }
        }
    }

    public static void print1(File file){
        if(!file.exists()){
            System.out.println("该文件不存在！！！");
        }else {
            File[] files=file.listFiles();
            for(File f:files){
                if(f.isFile()){
                    f.delete();
                }else {
                    print1(f);
                    f.delete();
                }
            }
        }
    }
}
