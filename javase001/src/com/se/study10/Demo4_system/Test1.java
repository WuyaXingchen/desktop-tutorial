package com.se.study10.Demo4_system;

public class Test1 {
    public static void main(String[] args) {
        // 1.public static void exit(int status):
        //   终止当前运行的Java虚拟机。
        //   该参数用作状态代码; 按照惯例，非零状态代码表示异常终止。
        //System.exit(0);

        // 2.public static long currentTimeMillis():
        //   获取当前系统的时间
        //   返回的是long类型的时间毫秒值：指的是从1970-1-1 0:0:0开始走到此刻的总的毫秒值，1s = 1000ms
        long time1 = System.currentTimeMillis();
        System.out.println(time1);

        for (int i = 0; i < 1000; i++) {
            System.out.print(i);
        }
        System.out.println();
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) / 1000.0 + "s");

    }
}
