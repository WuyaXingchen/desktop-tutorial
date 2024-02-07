package com.se.study10.Demo3_math;

// 目标：了解下Math类提供的常见方法。
public class Test1 {
    public static void main(String[] args) {
        // 1.public static int abs(int a)：取绝对值（拿到的结果一定是正数）
        //   public static double abs(double a)
        System.out.println(Math.abs(-1));   //  1
        System.out.println(Math.abs(1));    //  1
        System.out.println(Math.abs(-3.1)); //  3.1

        // 2.public static double ceil(double a): 向上取整
        System.out.println(Math.ceil(4.0001));  //  5.0
        System.out.println(Math.ceil(4));       //  4.0
        System.out.println(Math.ceil(3.9999));  //  4.0

        // 3.public static double floor(double a): 向下取整
        System.out.println(Math.floor(4.0001)); //  4.0
        System.out.println(Math.floor(4));      //  4.0
        System.out.println(Math.floor(3.9999)); //  3.0

        // 4.public static long round(double a)：四舍五入
        System.out.println(Math.round(3.49));   //  3
        System.out.println(Math.round(3.50));   //  4

        // 5.public static int max(int a, int b)：取较大值
        //   public static int min(int a, int b)：取较小值
        System.out.println(Math.max(1, 2));     //  2
        System.out.println(Math.min(1, 2));     //  1

        // 6.public static double pow(double a, double b)：取次方
        System.out.println(Math.pow(1, 0));     //  1.0
        System.out.println(Math.pow(2, 3));     //  8.0

        // 7.public static double random()： 取随机数 [0.0 , 1.0) (包前不包后)
        System.out.println(Math.random());
    }
}
