package com.se.study10.Demo9_calendar;

import java.util.Calendar;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        // 目标：掌握Calendar的使用和特点。
        // 1、得到系统此刻时间对应的日历对象。
        Calendar now=Calendar.getInstance();
        System.out.println(now);

        // 2、获取日历中的某个信息
        int year=now.get(Calendar.YEAR);
        System.out.println(year);

        int day=now.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

        // 3、拿到日历中记录的日期对象。
        Date date=now.getTime();
        System.out.println(date);

        // 4、拿到时间毫秒值
        long time=now.getTimeInMillis();
        System.out.println(time);

        // 5、修改日历中的某个信息
        now.set(Calendar.YEAR,2023);
        System.out.println(now);

        // 6、为某个信息增加或者减少多少
        now.add(Calendar.DAY_OF_YEAR, 100);
        now.add(Calendar.DAY_OF_YEAR, -10);
        now.add(Calendar.DAY_OF_MONTH, 6);
        now.add(Calendar.HOUR, 12);
        now.set(2026, 11, 22);
        System.out.println(now);
    }
}
