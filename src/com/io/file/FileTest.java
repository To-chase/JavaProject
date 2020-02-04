package com.io.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\a");
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println("绝对路径:"+file.getAbsolutePath());
//        System.out.println("文件名:"+file.getName());
//        System.out.println("相对路径:"+file.getPath()
//        if(file.exists()){
//            file.delete();
//        }
        file.mkdirs();
        if(!file.exists()){
            if(file.isFile()){
                file.createNewFile();
            }
        }
    }
}
