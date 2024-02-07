package com.se.study07.Demo6_single_instance;

//单例设计模式
public class Test1 {
    public static void main(String[] args) {
        A a1= A.getObject();
        A a2= A.getObject();
        System.out.println(a1);
        System.out.println(a2);
    }
}
