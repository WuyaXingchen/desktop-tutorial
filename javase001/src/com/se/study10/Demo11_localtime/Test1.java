package com.se.study10.Demo11_localtime;

import java.time.LocalTime;

public class Test1 {
    public static void main(String[] args) {
        // 0、获取本地时间对象
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println("------------------------");

        // 1、获取时间中的信息
        int hour = lt.getHour();
        int minute = lt.getMinute();
        int second = lt.getSecond();
        int nano = lt.getNano();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);
        System.out.println("------------------------");

        // 2、修改时间：withHour、withMinute、withSecond、withNano
        LocalTime lt1 = lt.withHour(10);
        LocalTime lt2 = lt.withMinute(10);
        LocalTime lt3 = lt.withSecond(10);
        LocalTime lt4 = lt.withNano(10);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        System.out.println(lt4);
        System.out.println("------------------------");

        // 3、加多少：plusHours、plusMinutes、plusSeconds、plusNanos
        LocalTime lt5 = lt.plusHours(10);
        LocalTime lt6 = lt.plusMinutes(10);
        LocalTime lt7 = lt.plusSeconds(10);
        LocalTime lt8 = lt.plusNanos(10);
        System.out.println(lt5);
        System.out.println(lt6);
        System.out.println(lt7);
        System.out.println(lt8);
        System.out.println("------------------------");

        // 4、减多少：minusHours、minusMinutes、minusSeconds、minusNanos
        LocalTime lt9 = lt.minusHours(10);
        LocalTime lt10 = lt.minusMinutes(10);
        LocalTime lt11 = lt.minusSeconds(10);
        LocalTime lt12 = lt.minusNanos(10);
        System.out.println(lt9);
        System.out.println(lt10);
        System.out.println(lt11);
        System.out.println(lt12);
        System.out.println("------------------------");

        // 5、获取指定时间的LocalTime对象：
        // public static LocalTime of(int hour, int minute, int second)
        LocalTime lt13=LocalTime.of(1,1,1);
        LocalTime lt14=LocalTime.of(1,1,1);
        System.out.println("------------------------");

        // 6、判断2个时间对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(lt13.equals(lt14));
        System.out.println(lt13.isBefore(lt));
        System.out.println(lt13.isAfter(lt));
        System.out.println("------------------------");
    }
}
