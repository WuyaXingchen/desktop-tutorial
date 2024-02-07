package com.se.study01.Demo2;

//自增自减运算符
public class Test2 {
    public static void main(String[] args) {
        int a = 10;

        ++a;
        System.out.println(a);

        --a;
        System.out.println(a);

        // 自增自减只能操作变量不能操作字面量
        //System.out.println(2++);

        System.out.println("--------------------------------------");

        int i = 10;
        int rs = ++i; // 先加后用
        System.out.println(rs);
        System.out.println(i);

        int j = 10;
        int rs2 = j++; // 先用后加
        System.out.println(rs2);
        System.out.println(j);
    }
}
