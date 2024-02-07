package com.se.study10.Demo16_period;

import java.time.LocalDate;
import java.time.Period;

//Period的作用：计算机两个日期相差的年数，月数、天数。
public class Test1 {
    public static void main(String[] args) {
        LocalDate start=LocalDate.of(2500,6,6);
        LocalDate end=LocalDate.of(2999,12,12);

        Period period=Period.between(start,end);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
