package com.se.study05.Demo5_javabean;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setScore(90);
        StudentOperator operator = new StudentOperator(s1);
        operator.printPass();
    }
}
