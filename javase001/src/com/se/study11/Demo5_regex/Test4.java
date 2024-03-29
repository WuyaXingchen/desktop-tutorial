package com.se.study11.Demo5_regex;

import java.util.Arrays;

//正则表达式搜索、替换
public class Test4 {
    public static void main(String[] args) {
        // 1、public String replaceAll(String regex , String newStr)：按照正则表达式匹配的内容进行替换
        // 需求1：请把下面字符串中的不是汉字的部分替换为 “-”
        String s1 = "张三abc123李四9999aaaa王五";
        System.out.println(s1.replaceAll("\\w+", "-"));

        // 需求2(拓展)：某语音系统，收到一个口吃的人说的“我我我喜欢编编编编编编编编编编编编程程程！”，需要优化成“我喜欢编程！”。
        String s2 = "我我我喜欢编编编编编编编编编编编编程程程";
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));

        // 2、public String[] split(String regex)：按照正则表达式匹配的内容进行分割字符串，反回一个字符串数组。
        // 需求1：请把下面字符串中的人名取出来，使用切割来做
        String s3 = "张三abc123李四9999aaaa王五";
        String[] names = s3.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}
