package com.se.study15.Demo4_copyfile;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个字节输入流管道与源文件接通
        InputStream is = new FileInputStream("C:\\Users\\31045\\Desktop\\test\\test.txt");
        // 2、创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("C:\\Users\\31045\\Desktop\\文件\\test.txt");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }

        os.close();
        is.close();
        System.out.println("复制完成");
    }
}
