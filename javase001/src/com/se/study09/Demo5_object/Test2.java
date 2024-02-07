package com.se.study09.Demo5_object;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User("张三", "1234", new double[]{99.0, 100.0});


        //调用方法克隆得到一个新对象
        User u2 = (User) u1.clone();
        System.out.println(u1.getName());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());
        System.out.println("------------");
        System.out.println(u2.getName());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());
    }
}
