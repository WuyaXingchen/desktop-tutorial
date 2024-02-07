package com.se.study07.Demo5_block;

public class Student {
    static String name = "乌鸦";
    static int age = 80;
    int number;

    //静态代码块
    //类加载时自动执行，由于类只加载一次，所以静态代码块只执行一次
    //完成类的初始化
    static {
        System.out.println("静态代码块执行了~~");
    }

    //每次创建对象之前都会先执行实例代码块，并且会在构造器之前执行
    {
        System.out.println("实例代码块执行了~~");
        number = 100;
    }

    public Student() {
        System.out.println("无参构造器执行了~~");

    }

    public Student(int number) {
        System.out.println("有参构造器执行了~~");
    }
}
