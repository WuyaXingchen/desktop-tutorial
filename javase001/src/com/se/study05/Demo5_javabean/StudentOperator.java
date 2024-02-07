package com.se.study05.Demo5_javabean;

public class StudentOperator {
    private Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass() {
        if (student.getScore() >= 60)
            System.out.println(student.getName() + "及格了~~");
        else
            System.out.println(student.getName() + "不及格！！");
    }
}
