package com.se.study08.Demo3_abstract;

public class Test1 {
    public static void main(String[] args) {
        //抽象类是不能创建对象的，如果抽象类的对象就会报错
        //A a=new A();
        B b = new B();
        b.test();
    }
}
