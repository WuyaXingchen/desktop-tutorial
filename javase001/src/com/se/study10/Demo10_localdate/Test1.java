package com.se.study10.Demo10_localdate;

import java.time.LocalDate;

public class Test1 {
    public static void main(String[] args) {
        // 0、获取本地日期对象(不可变对象)
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 1、获取日期对象中的信息
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        int dayOfWeek = ld.getDayOfWeek().getValue();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfYear);
        System.out.println(dayOfWeek);

        // 2、直接修改某个信息: withYear、withMonth、withDayOfMonth、withDayOfYear
        LocalDate ld2 = ld.withYear(2999);
        LocalDate ld3 = ld.withMonth(6);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld);

        // 3、把某个信息加多少: plusYears、plusMonths、plusDays、plusWeeks
        LocalDate ld4 = ld.plusYears(2);
        LocalDate ld5 = ld.plusMonths(2);

        // 4、把某个信息减多少：minusYears、minusMonths、minusDays、minusWeeks
        LocalDate ld6 = ld.minusYears(2);
        LocalDate ld7 = ld.minusMonths(2);

        // 5、获取指定日期的LocalDate对象： public static LocalDate of(int year, int month, int dayOfMonth)
        LocalDate ld8 = LocalDate.of(2500, 1, 2);
        LocalDate ld9 = LocalDate.of(2500, 1, 2);

        // 6、判断2个日期对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(ld8.equals(ld9));
        System.out.println(ld8.isBefore(ld));
        System.out.println(ld8.isAfter(ld));

    }
}
