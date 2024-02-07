package com.se.study13.Demo2_hashset_linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

//HashSet子类LinkedHashSet有序、无索引、不重复
public class Test2 {
    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();
        Student s1 = new Student("张三", 20, 169.6);
        Student s2 = new Student("李四", 23, 169.6);
        Student s3 = new Student("李四", 23, 169.6);
        Student s4 = new Student("王五", 25, 169.6);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
