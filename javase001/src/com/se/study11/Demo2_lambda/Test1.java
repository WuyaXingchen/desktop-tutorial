package com.se.study11.Demo2_lambda;

public class Test1 {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("游泳~~~~");
            }
        };
        s.swim();

        //2.使用Lambda表达式对Swimming接口的匿名内部类进行简化
        Swimming s1 = () -> {
            System.out.println("游泳~~~~");
        };
        s1.swim();
    }
}
