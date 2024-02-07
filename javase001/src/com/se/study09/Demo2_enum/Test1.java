package com.se.study09.Demo2_enum;

//获取枚举A类的，枚举项
public class Test1 {
    public static void main(String[] args) {
        //反编译结果是public static final A X
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;
    }
}
