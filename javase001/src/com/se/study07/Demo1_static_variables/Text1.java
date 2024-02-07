package com.se.study07.Demo1_static_variables;

//static修饰成员变量
public class Text1 {
    public static void main(String[] args) {
        //类名.静态变量(类名.类变量)
        Student.role = "学生";

        Student s1 = new Student();
        Student s2 = new Student();
        //对象.类变量(不推荐)
        System.out.println(s1.role);
        s1.role = "老师";

        System.out.println(Student.role);
        //对象.实例变量
        s1.name = "张三";
        s1.age = 18;
        s2.name = "李四";
        s2.age = 19;

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
