package com.se.study08.Demo2_final;

public class Test1 {
    //常量
    public static final String SCHOOL_NAME = "xx大学";

    public static void main(String[] args) {
        //final修饰变量：该变量只能被赋值一次。
        final double a = 3.14;
        //a = 3;    //只能赋值一次
        test(2);//第一次赋值

        final int[] arr1 = {10, 20, 30};
        //arr1 = null;  //二次赋值
        arr1[1] = 11;   //数组元素可以修改
        System.out.println(SCHOOL_NAME);
    }

    public static void test(final double b) {
        //b = 1;    //第二次赋值，报错
    }
}

//final修饰类：该类称为最终类
//特点是不能被继承
final class A {
}
//class B extends A{} //出错

//final修饰方法：该方法称之为最终方法
//特点是不能被重写。
class C {
    public final void test() {
    }
}

class D extends C {
//    @Override
//    public void test() {
//
//    }
}
