package com.se.study07.Demo2_static_method;

//static修饰成员方法
public class Test1 {
    public static void main(String[] args) {
        //调用时直接用类名调用即可
        Student.print();
        //调用时，需要使用对象调用
        Student s = new Student();
        s.score = 80;
        s.printScore();
    }
}
