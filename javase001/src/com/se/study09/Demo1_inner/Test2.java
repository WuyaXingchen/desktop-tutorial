package com.se.study09.Demo1_inner;

//匿名内部类
public class Test2 {
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗刨");
            }
        };
        go(s1);
        Swimming s2 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("蛙泳");
            }
        };
        go(s2);
    }

    public static void go(Swimming s) {
        System.out.println("====开始====");
        s.swim();
        System.out.println("====结束====");
    }
}
