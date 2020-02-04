package com.io.file;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {
    public static void main(String[] args) {
        File file=new File("E:\\a");
//        printDir(file);
        printDir1(file);
    }
    public static void printDir1(File file){
//     File[] files=file.listFiles(new FileFilter() {
//         @Override
//         public boolean accept(File pathname) {
//             return pathname.getName().endsWith(".java")||pathname.isDirectory();
//         }
//     });
        File[] files=file.listFiles(f->{
            return f.getName().endsWith(".java")||f.isDirectory();
        });
     for (File f:files){
         if(f.isFile()){
             System.out.println(f.getAbsolutePath());
         }else {
             printDir1(f);
         }
     }
    }
    public static void printDir(File file){
        File[] files=file.listFiles();
        if(files!=null){
            for(File f:files){
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getAbsolutePath());
                }else {
                    printDir(f);
                }
            }
        }

    }
}
