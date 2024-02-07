package com.se.study14.Demo6_file;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File f1 = new File("C:/Users/31045/Desktop/test/test.txt");
        File f2 = new File("C:\\Users\\31045\\Desktop\\test\\test.txt");
        File f3 = new File("C:" + File.separator + "Users" + File.separator + "31045" + File.separator + "Desktop" + File.separator + "test" + File.separator + "test.txt");
        System.out.println(f1.length());
        System.out.println(f2.length());
        System.out.println(f3.length());
        System.out.println(f3.exists());

        File f4 = new File("C:/Users/31045/Desktop/test");
        System.out.println(f4.exists());
        System.out.println(f4.length());

        // 绝对路径：带盘符的
        // 相对路径（重点）：不带盘符，默认是直接去工程下寻找文件的。
        File f5 = new File("src\\test.txt");
        System.out.println(f5.exists());
    }
}
