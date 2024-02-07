package com.se.study14.Demo6_file;

import java.io.File;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        // 1、public String[] list()：获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
        File f1 = new File("C:/Users/31045/Desktop");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }
        // 2、public File[] listFiles():（重点）获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        File f = new File("C:/Users/31045/Desktop");
        File[] files1 = f.listFiles();
        System.out.println(Arrays.toString(files1));
    }
}
