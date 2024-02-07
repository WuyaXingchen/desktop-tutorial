package com.se.study04.Demo1_method;

public class Test4 {
    public static void main(String[] args) {
        //判断一个数是奇数还是偶数
        judge(1);
        judge(4);
        judge(7);
        judge(12);
    }

    public static void judge(int number) {
        if (number % 2 == 0)
            System.out.println(number + "是偶数");
        else
            System.out.println(number + "是奇数");
    }
}
