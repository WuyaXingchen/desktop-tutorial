package com.se.study16.Demo3_buffered_stream;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("src/test.txt");
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("src/test01out.txt");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            System.out.println("复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
