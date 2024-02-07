package com.se.study01.Demo2;

import java.util.Scanner;

//获取用户键盘输入的数据
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3、开始 调用sc的功能，来接收用户键盘输入的数据。
        System.out.println("请您输入您的年龄：");
        int age = sc.nextInt(); // 执行到这儿，会开始等待用户输入一个整数，直到用户按了回车键，才会拿到数据。
        System.out.println("您的年龄是："  + age);

        System.out.println("请您输入您的名字：");
        String name = sc.next(); // 执行到这儿，会开始等待用户输入一个字符串，直到用户按了回车键，才会拿到数据。
        System.out.println(name + "欢迎您进入系统~~");
    }
}
