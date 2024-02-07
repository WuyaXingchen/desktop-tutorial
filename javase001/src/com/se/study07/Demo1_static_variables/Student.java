package com.se.study07.Demo1_static_variables;

public class Student {
    //类变量，静态变量
    //有static修饰，属于类，在内存中只有一份，用类名调用
    static String role;
    //实例变量
    //无static修饰，属于对象，每一个对象都有一份，用对象调用
    String name;
    int age;
}
