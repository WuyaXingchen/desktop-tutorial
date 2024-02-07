package com.se.study15.Demo2_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个字节输入流对象代表字节输入流管道与源文件接通。
        InputStream is = new FileInputStream("src\\test.txt");

        // 2、开始读取文件中的字节数据：每次读取多个字节。
        //  public int read(byte b[]) throws IOException
        //  每次读取多个字节到字节数组中去，返回读取的字节数量，读取完毕会返回-1.

        // 3、使用循环改造
        byte[] bytes = new byte[3];
        int len;
        while ((len = is.read(bytes)) != -1) {
            String rs = new String(bytes, 0, len);
            System.out.println(rs);
        }
        is.close();
    }
}
