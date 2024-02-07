package com.se.study05.Demo1_oop;

//现在假设我们需要处理的是学生的姓名、语文成绩、数学成绩这三个数据，要求打印输出这个学生的总成绩，和平均成绩。
public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 100;
        s1.math = 90;
        s1.printTotalScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "李四";
        s2.chinese = 90;
        s2.math = 95;
        s2.printTotalScore();
        s2.printAverageScore();
    }
}
