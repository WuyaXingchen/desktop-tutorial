package com.se.study15.Demo2_fileinputstream;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        // 1、一次性读取完文件的全部字节到一个字节数组中去
        // 创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("src\\test.txt");

        // 2、准备一个字节数组，大小与文件的大小正好一样大
        File f = new File("src\\test.txt");
        long size = f.length();
        byte[] bytes = new byte[(int) size];

        int len = is.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));
        is.close();

        //第二种
        InputStream is1 = new FileInputStream("src\\test.txt");
        byte[] bytes1 = is1.readAllBytes();
        System.out.println(new String(bytes1));

        //关闭流
        is.close();
    }
}
