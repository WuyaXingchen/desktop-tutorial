package com.se.study01.Demo2;

//三元运算符
public class Test6 {
    public static void main(String[] args) {
        double score = 58.5;
        String rs = score >= 60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);

        // 需求2：找出2个整数中的较大值，并输出。
        int a = 99;
        int b = 69;
        int max = a > b ? a : b;
        System.out.println(max);

        // 需求3：找3个整数中的较大值。
        int i = 10;
        int j = 45;
        int k = 34;

        // 找出2个整数中的较大值。
        int temp = i > j ? i : j;
        // 找出temp与k中的较大值。
        int max2 = temp > k ? temp : k;
        System.out.println(max2);
    }
}
