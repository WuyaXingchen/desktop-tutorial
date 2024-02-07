package com.se.study05.Demo5_javabean;

public class Student {
    private String name;
    private double score;

    //1.无参构造器
    public Student() {
    }

    //2.有参构造器
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    //3.get,set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
