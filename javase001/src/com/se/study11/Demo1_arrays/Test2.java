package com.se.study11.Demo1_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("张三", 169.5, 23);
        students[1] = new Student("李四", 163.8, 26);
        students[2] = new Student("李四", 163.8, 26);
        students[3] = new Student("王五", 167.5, 24);

        // 1、public static void sort(类型[] arr)：对数组进行排序。
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        //Lambda表达式简化
        Arrays.sort(students, (Student o1, Student o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight());
        });
        //Lambda表达式简化
        Arrays.sort(students, (o1, o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight());
        });
        //Lambda表达式简化
        Arrays.sort(students, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));

        System.out.println(Arrays.toString(students));
    }
}
