package com.se.study16.Demo7_inputstreamwriter;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try (
                // 1、创建一个文件字节输出流
                OutputStream os = new FileOutputStream("src/test04out.txt");
                // 2、把原始的字节输出流，按照指定的字符集编码转换成字符输出转换流。
                Writer osw = new OutputStreamWriter(os, "GBK");
                // 3、把字符输出流包装成缓冲字符输出流
                BufferedWriter bw = new BufferedWriter(osw);
        ) {
            bw.write("测试语句abc");
            bw.write("测试123");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
