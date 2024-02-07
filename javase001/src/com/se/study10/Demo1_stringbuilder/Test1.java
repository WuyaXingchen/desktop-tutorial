package com.se.study10.Demo1_stringbuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("wuya");

        //1.拼接内容
        s1.append(123);
        s1.append("乌鸦");
        s1.append(true);

        //2.append方法，支持链式编程
        s1.append(666).append("xx").append(888);
        System.out.println(s1);

        //3.反转操作
        s1.reverse();
        System.out.println(s1);

        //4.返回字符串的长度
        System.out.println(s1.length());

        //5.StringBuilder还可以转换为字符串
        String s2 = s1.toString();
        System.out.println(s2);
    }
}
