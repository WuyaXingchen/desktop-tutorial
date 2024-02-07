package com.se.study07.Demo6_single_instance;

public class B {
    //2.定义一个类变量，记住类的一个对象
    private static B b;

    //1.必须私有类的构造器
    private B() {
    }

    //3.定义一个类方法返回类的对象，第一次调用创建类对象，后面调用都用这个
    public static B getObject() {
        if (b == null)
            b = new B();
        return b;
    }
}
