package com.se.study05.Demo4_constructor;

public class Student {
    String name;
    double score;

    //无参构造器
    public Student() {
        System.out.println("无参构造器触发了==");
    }

    //有参构造器
    public Student(String name, double score) {
        System.out.println("有参构造器触发了!!");
        this.name = name;
        this.score = score;
    }
}
