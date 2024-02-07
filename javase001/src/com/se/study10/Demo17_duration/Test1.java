package com.se.study10.Demo17_duration;

import java.time.Duration;
import java.time.LocalDateTime;

//可以用于计算两个时间对象相差的天数、小时数、分数、秒数、纳秒数；支持LocalTime、LocalDateTime、Instant等时间
public class Test1 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025, 11, 11, 10, 10, 10);
        LocalDateTime end = LocalDateTime.of(2025, 11, 11, 11, 11, 11);
        // 1、得到Duration对象
        Duration duration = Duration.between(start, end);

        // 2、获取两个时间对象间隔的信息
        System.out.println(duration.toDays());      // 间隔多少天
        System.out.println(duration.toHours());     // 间隔多少小时
        System.out.println(duration.toMinutes());   // 间隔多少分
        System.out.println(duration.toSeconds());   // 间隔多少秒
        System.out.println(duration.toMillis());    // 间隔多少毫秒
        System.out.println(duration.toNanos());     // 间隔多少纳秒
    }
}
