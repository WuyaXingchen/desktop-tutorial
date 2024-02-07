package com.se.study07.Demo11_override;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student("张三", 18);
        //System.out.println(s.toString());
        //默认s后面有.toString()，省略了
        System.out.println(s);
    }
}
