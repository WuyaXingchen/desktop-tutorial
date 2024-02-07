package com.se.study07.Demo6_single_instance;

public class Test2 {
    public static void main(String[] args) {
        B b1=B.getObject();
        B b2=B.getObject();
        System.out.println(b1);
        System.out.println(b2);
    }
}
