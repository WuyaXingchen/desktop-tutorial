package com.se.study02.Demo3_for;

public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1-100的数据和：" + sum);

        int sum1 = 0;
        for (int i = 1; i < 100; i += 2) {
            sum1 += i;
        }
        System.out.println("1-100之间的奇数和：" + sum1);
    }
}
