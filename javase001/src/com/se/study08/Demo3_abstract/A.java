package com.se.study08.Demo3_abstract;

//类的成员（成员变量、成员方法、构造器），类的成员都可以有
//abstract修饰类，这个类就是抽象类
public abstract class A {
    //成员变量
    private String name;
    static String schoolName;

    //构造方法
    public A() {
    }

    //abstract修饰方法，这个方法就是抽象方法（不允许有方法体{}）
    public abstract void test();

    //实例方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
