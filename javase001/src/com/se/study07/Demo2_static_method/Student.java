package com.se.study07.Demo2_static_method;

public class Student {
    double score;

    //类方法
    //有static修饰的方法，是属于类的
    public static void print() {
        System.out.println("-----------");
        System.out.println("Hello World");
        System.out.println("-----------");
    }

    //实例方法
    //无static修饰的方法，是属于对象的
    public void printScore() {
        System.out.println(score >= 60 ? "及格了~~" : "不及格！！");
    }
}
