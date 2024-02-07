package com.se.study07.Demo7_extend;

public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
        b.print1();
        b.print3();

        //父类私有成员，子类对象时不可以调用的
        //System.out.println(j);
        //b.print2();
    }
}
