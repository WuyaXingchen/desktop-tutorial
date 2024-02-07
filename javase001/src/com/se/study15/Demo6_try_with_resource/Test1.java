package com.se.study15.Demo6_try_with_resource;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try (
                // 1、创建一个字节输入流管道与源文件接通
                InputStream is = new FileInputStream("src\\test.txt");
                // 2、创建一个字节输出流管道与目标文件接通。
                OutputStream os = new FileOutputStream("src\\testcopy.txt");
        ) {
            // 3、创建一个字节数组，负责转移字节数据。
            byte[] buffer = new byte[1024]; // 1KB.
            // 4、从字节输入流中读取字节数据，写出去到字节输出流中。读多少写出去多少。
            int len; // 记住每次读取了多少个字节。
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成！！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
