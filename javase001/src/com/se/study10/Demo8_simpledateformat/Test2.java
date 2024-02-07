package com.se.study10.Demo8_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        // 目标：完成秒杀案例。
        // 1、把开始时间、结束时间、两人下单时间拿到程序中来。
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String rs1 = "2023年11月11日 0:01:18";
        String rs2 = "2023年11月11日 0:10:57";

        // 2、把字符串的时间解析成日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt = sdf.parse(start);
        Date endDt = sdf.parse(end);
        Date d1 = sdf.parse(rs1);
        Date d2 = sdf.parse(rs2);

        // 3、开始判断小皮和小贾是否秒杀成功了。
        // 把日期对象转换成时间毫秒值来判断
        long startTime = startDt.getTime();
        long endTime = endDt.getTime();
        long time1 = d1.getTime();
        long time2 = d2.getTime();

        if (time1 >= startTime && time1 <= endTime)
            System.out.println("张三秒杀成功~~");
        else
            System.out.println("张三秒杀失败！！");
        if (time2 >= startTime && time2 <= endTime)
            System.out.println("李四秒杀成功~~");
        else
            System.out.println("李四秒杀失败！！");
    }
}
