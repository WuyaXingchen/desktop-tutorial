package com.se.study02.Demo2_switch;

public class Test1 {
    public static void main(String[] args) {
        String week = "周三";
        switch (week) {
            case "周一":
                System.out.println("吃");
                break;
            case "周二":
                System.out.println("喝");
                break;
            case "周三":
                System.out.println("玩");
                break;
            case "周四":
                System.out.println("乐");
                break;
            case "周五":
                System.out.println("不吃");
                break;
            case "周六":
                System.out.println("不喝");
                break;
            case "周日":
                System.out.println("不玩");
                break;
            default:
                System.out.println("您输入的星期信息不存在~~~");
        }
    }
}
