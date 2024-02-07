package com.se.study07.Demo7_extend;

public class B extends A {
    public void print3() {
        System.out.println(i);
        print1();

        //父类A的私有成员，在子类中不可以被使用
        //System.out.println(j);
        //print2();
    }
}
