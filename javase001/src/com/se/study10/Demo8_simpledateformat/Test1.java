package com.se.study10.Demo8_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        // 目标：掌握SimpleDateFormat的使用
        // 1、准备一些时间
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        // 2、格式化日期对象，和时间 毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        String rs1 = sdf.format(d);
        String rs2 = sdf.format(time);
        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println("==========");

        // 目标：掌握SimpleDateFormat解析字符串时间 成为日期对象
        String dateStr="2024-10-11 10:11:12";

        // 1、创建简单日期格式化对象 , 指定的时间格式必须与被解析的时间格式一模一样，否则程序会出bug
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2=sdf2.parse(dateStr);
        System.out.println(d2);
    }
}
