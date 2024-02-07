package com.se.study08.Demo1_polymorphism;

public class Test1 {
    public static void main(String[] args) {
        //对象多态
        People t = new Teacher();
        People s = new Student();

        //行为多态
        t.run();
        s.run();
    }
}
