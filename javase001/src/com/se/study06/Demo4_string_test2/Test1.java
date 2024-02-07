package com.se.study06.Demo4_string_test2;

//1.首先，设计一个方法，该方法接收一个整型参数，最终要返回对应位数的随机验证码。
//2.方法内定义2个字符串变量：1个用来记住生成的验证码，1个用来记住要用到的全部字符。
//3.定义for循环控制生成多少位随机字符
//4.每次得到一个字符范围内的随机索引
//5.根据索引提取该字符，把该字符交给code变量连接起
//6.循环结束后，在循环外返回code即可。
//7.在主方法中调用生成验证码的方法

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("-----生成4位随机验证码-----");
        System.out.println(createCode(4));
        System.out.println("-----生成8位随机验证码-----");
        System.out.println(createCode(8));
    }

    public static String createCode(int n) {
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rs1 = new Random();
        for (int i = 0; i < n; i++) {
            int rs2 = rs1.nextInt(data.length());
            code += data.charAt(rs2);
        }
        return code;
    }
}
