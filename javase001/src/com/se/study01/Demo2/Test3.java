package com.se.study01.Demo2;

//赋值运算符
public class Test3 {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 520;
        a += b;  // a = (double)(a + b);
        System.out.println(a);

        // -= 需求：发红包
        double i = 600;
        double j = 520;
        i -= j;  // i = (double)(i - j);
        System.out.println(i);

        int m = 10;
        int n = 5;
        // m *= n; // 等价形式： m = (int)(m * n)
        // m /= n; // 等价形式： m = (int)(m / n)
        m %= n;    // 等价形式： m = (int)(m % n)
        System.out.println(m);
    }
}
