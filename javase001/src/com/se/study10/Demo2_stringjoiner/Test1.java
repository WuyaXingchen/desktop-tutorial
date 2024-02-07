package com.se.study10.Demo2_stringjoiner;

import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        //间隔符
        StringJoiner s = new StringJoiner(",");
        s.add("Java1");
        s.add("Java2");
        s.add("Java3");
        System.out.println(s);
        //参数1：间隔符
        //参数2：开头
        //参数3：结尾
        StringJoiner s1 = new StringJoiner(",", "[", "]");
        s1.add("张三");
        s1.add("李四");
        s1.add("王五");
        System.out.println(s1);
    }
}
