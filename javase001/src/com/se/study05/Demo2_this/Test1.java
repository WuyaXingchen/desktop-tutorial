package com.se.study05.Demo2_this;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();
        System.out.println("======================");
        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        Student s3 = new Student();

        s1.score = 90;
        s2.score = 80;
        s3.score = 60;
        s1.printJudge(80);
        s2.printJudge(90);
        s3.printJudge(60);
    }
}
