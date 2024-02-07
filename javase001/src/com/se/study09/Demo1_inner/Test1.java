package com.se.study09.Demo1_inner;

public class Test1 {
    public static void main(String[] args) {
        //内部类
        Outer.Inner1 in1 = new Outer().new Inner1();
        in1.test();

        //静态内部类
        Outer.Inner2 in2 = new Outer.Inner2();
        in2.test();

        //局部内部类
        Outer outer = new Outer();
        outer.test();
    }
}
