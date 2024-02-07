package com.se.study04.Demo1_method;

public class Test3 {
    public static void main(String[] args) {
        //求1-n的和
        int rs1 = add(5);
        System.out.println("1-5的和：" + rs1);

        int rs2 = add(10);
        System.out.println("1-10的和：" + rs2);
    }

    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
