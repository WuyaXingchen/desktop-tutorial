package com.se.study10.Demo14_instant;

import java.time.Instant;

public class Test1 {
    public static void main(String[] args) {
        // 1、创建Instant的对象，获取此刻时间信息
        Instant now = Instant.now();
        System.out.println(now);

        // 2、获取总秒数
        long second = now.getEpochSecond();
        System.out.println(second);

        // 3、不够1秒的纳秒数
        int nano = now.getNano();
        System.out.println(nano);
        System.out.println(now);

        // Instant对象的作用：做代码的性能分析，或者记录用户的操作时间点
        Instant now1 = Instant.now();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        Instant now2 = Instant.now();
        System.out.println((now2.getEpochSecond() - now1.getEpochSecond()) + "秒");
        System.out.println((now2.getNano() - now1.getNano()) + "纳秒");
    }
}
