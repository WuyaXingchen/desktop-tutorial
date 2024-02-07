package com.se.study14.Demo5_stream;

import com.se.study13.Demo3_treeset.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 100.0, 99.0, 80.5, 96.5, 9.5, 60.0, 59.9);
        // 需求1：找出成绩大于等于60分的数据，并升序后，再输出。
        scores.stream().filter(s -> s >= 60).sorted().forEach(s -> System.out.println(s));

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("小张", 26, 172.5);
        Student s2 = new Student("小张", 26, 172.5);
        Student s3 = new Student("小李", 23, 167.6);
        Student s4 = new Student("小王", 25, 169.0);
        Student s5 = new Student("老张", 35, 183.3);
        Student s6 = new Student("老李", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);

        // 需求2：找出年龄大于等于23,且年龄小于等于30岁的学生，并按照年龄降序输出.
        students.stream().filter(s -> s.getAge() >= 23 && s.getAge() <= 30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .forEach(s -> System.out.println(s));
        System.out.println();

        // 需求3：取出身高最高的前3名学生，并输出。
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .limit(3).forEach(System.out::println);
        System.out.println();

        // 需求4：取出身高倒数的2名学生，并输出。
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
                .skip(students.size() - 2).forEach(System.out::println);
        System.out.println();

        // 需求5：找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出。
        students.stream().filter(s -> s.getHeight() > 168).map(Student::getName)
                .distinct().forEach(System.out::println);
        System.out.println();

        //合并两个流为一个流
        Stream<String> st1 = Stream.of("张三", "李四");
        Stream<String> st2 = Stream.of("张三1", "李四1", "王五");
        Stream<String> st = Stream.concat(st1, st2);
        st.forEach(System.out::println);

        // 需求1：请计算出身高超过168的学生有几人。
        long size = students.stream().filter(s -> s.getHeight() > 168).count();
        System.out.println(size);

        // 需求2：请找出身高最高的学生对象，并输出。
        Student s = students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(s);

        // 需求3：请找出身高最矮的学生对象，并输出。
        Student ss = students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(ss);

        // 需求4：请找出身高超过170的学生对象，并放到一个新集合中去返回。
        // 流只能收集一次。
        List<Student> students1 = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toList());
        System.out.println(students1);

        Set<Student> students2 = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toSet());
        System.out.println(students2);
    }
}
