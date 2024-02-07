package com.se.study11.Demo3_method_reference;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);

        // 原始写法：对数组中的学生对象，按照年龄升序排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 按照年龄升序排序
            }
        });

        // 使用Lambda简化后的形式
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        Arrays.sort(students, (o1, o2) -> CompareByData.compareByAge(o1, o2));
        // 静态方法引用
        Arrays.sort(students, CompareByData::compareByAge);

        CompareByData compare = new CompareByData();
        Arrays.sort(students, (o1, o2) -> compare.compareByAge2(o1, o2)); // 降序
        Arrays.sort(students, compare::compareByAge2); // 降序
    }
}
