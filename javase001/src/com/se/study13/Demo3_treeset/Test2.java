package com.se.study13.Demo3_treeset;

import java.util.Set;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();

        Student s1 = new Student("张三", 20, 169.6);
        Student s2 = new Student("李四", 23, 169.8);
        Student s3 = new Student("王五", 23, 169.6);
        Student s4 = new Student("王二", 48, 169.6);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
    }
}
