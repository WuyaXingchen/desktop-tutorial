package com.se.study15.Demo2_fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // 1、创建文件字节输入流管道，与源文件接通。
        InputStream is = new FileInputStream(("src/test.txt"));

        // 2、开始读取文件的字节数据。
        // public int read():每次读取一个字节返回，如果没有数据了，返回-1.
        int i;
        while ((i = is.read()) != -1) {
            System.out.println((char) i);
        }
        is.close();
    }
}
