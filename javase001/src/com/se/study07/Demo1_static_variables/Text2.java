package com.se.study07.Demo1_static_variables;

//需求：系统启动后，要求用于类可以记住自己创建了多少个用户对象。
public class Text2 {
    public static void main(String[] args) {
        new User();
        new User();
        new User();
        new User();

        System.out.println("创建了用户对象个数：" + User.number);
    }
}
