package com.se.study20.Demo1_test;

public class StringUtil {
    public static void printNumber(String name){
        System.out.println("名字长度："+name.length());
    }
    public static int getMaxIndex(String data){
        if(data == null){
            return -1;
        }
        return data.length();
    }
}
