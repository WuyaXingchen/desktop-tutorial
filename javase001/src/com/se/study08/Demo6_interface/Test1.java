package com.se.study08.Demo6_interface;

public class Test1 {
    public static void main(String[] args) {
        //打印A接口中的常量
        System.out.println(A.SCHOOL_NAME);

        //接口是不能创建对象的
        //A a = new A();
        D d = new D();
    }
}
