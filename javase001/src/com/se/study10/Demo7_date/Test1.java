package com.se.study10.Demo7_date;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        // 1、创建一个Date的对象：代表系统当前时间信息的。
        Date d = new Date();
        System.out.println(d);

        // 2、拿到时间毫秒值。
        long t = d.getTime();
        System.out.println(t);
        // 3、把时间毫秒值转换成日期对象： 2s之后的时间是多少。
        Date d2 = new Date(t += 2 * 1000);
        System.out.println(d2);

        // 4、直接把日期对象的时间通过setTime方法进行修改
        Date d3 = new Date();
        d3.setTime(t);
        System.out.println(d3);
    }
}
