package com.se.study04.Demo3_return;

public class Text1 {
    public static void main(String[] args) {
        System.out.println("开始");
        chu(10, 0);
        System.out.println("结束");
    }

    public static void chu(int a, int b) {
        if (b == 0) {
            System.err.println("出错了");
            return;
        }
        int c = a / b;
        System.out.println(c);
    }
}
