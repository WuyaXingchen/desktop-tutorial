package com.se.study14.Demo6_file;

import java.io.File;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        searchFile(new File("C:\\Users\\31045\\Desktop\\文件\\全部讲义"),"t.txt");
    }
    public static void searchFile(File dir,String fileName) throws IOException {
        if (dir==null||!dir.exists()||dir.isFile()){
            return;
        }
        File[] files=dir.listFiles();
        if (files!=null&&files.length>0){
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().contains(fileName)){
                        System.out.println("找到了："+f.getAbsolutePath());
                        Runtime runtime=Runtime.getRuntime();
                        runtime.exec("cmd /c "+f.getAbsolutePath());
                    }
                } else {
                    searchFile(f,fileName);
                }
            }
        }
    }
}
