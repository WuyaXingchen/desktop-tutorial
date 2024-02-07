package com.se.study04.Demo2_method_overLoad;
/*
    一个类中，只要一些方法的名称相同、形参列表不同，那么它们就是方法重载了，
    其它的都不管（如：修饰符，返回值类型是否一样都无所谓）。
    形参列表不同指的是：形参的个数、类型、顺序不同，不关心形参的名称。
*/

public class Test1 {
    public static void main(String[] args) {
        test();
        test(10);
    }
    public static void test(){
        System.out.println("test1");
    }
    public static void test(int a){
        System.out.println("test2");
    }
    void test(double a){

    }

    void test(double a, int b){
    }

    void test(int b, double a){
    }

    int test(int a, int b){
        return a + b;
    }
}
