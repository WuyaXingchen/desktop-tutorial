package com.se.study10.Demo15_datetimeformater;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//线程安全
public class Test1 {
    public static void main(String[] args) {
        // 1、创建一个日期时间格式化器对象出来。
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2、对时间进行格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 正向格式化
        String rs1 = dtf.format(now);
        System.out.println(rs1);

        // 3、格式化时间，其实还有一种方案。
        // 反向格式化
        String rs2 = now.format(dtf);
        System.out.println(rs2);

        // 4、解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析。
        String dateStr = "2999年12月12日 10:11:12";
        LocalDateTime ldt = LocalDateTime.parse(dateStr, dtf);
        System.out.println(ldt);
    }
}
