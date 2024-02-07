package com.se.study07.Demo8_extend_test;

public class Test1 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSkill("教学");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        t.printInfo();
    }
}
