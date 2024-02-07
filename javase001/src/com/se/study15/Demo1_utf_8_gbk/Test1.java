package com.se.study15.Demo1_utf_8_gbk;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//编码解码
public class Test1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码
        String data = "a我b";
        //默认是按照平台字符集（UTF-8）进行编码的。
        byte[] bytes = data.getBytes();

        //按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //2.解码
        String s1 = new String(bytes);
        System.out.println(s1);

        String s2 = new String(bytes1, "GBK");
        System.out.println(s2);
    }
}
