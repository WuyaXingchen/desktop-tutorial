package com.se.study09.Demo4_generics;

//泛型方法
public class Test2 {
    public static void main(String[] args){
        //调用test方法，传递字符串数据，那么test方法的泛型就是String类型
        String rs = test("test");
        System.out.println(rs);
        //调用test方法，传递Dog对象，那么test方法的泛型就是Dog类型
        int i = test(12);
        System.out.println(i);
    }

    //这是一个泛型方法<T>表示一个不确定的数据类型，由调用者确定
    public static <T> T test(T t){
        return t;
    }
}
