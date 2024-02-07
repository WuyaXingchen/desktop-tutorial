package com.se.study04.Demo2_method_overLoad;
/*
    需求：开发武器系统，功能需求如下：
        可以默认发一枚武器。
        可以指定地区发射一枚武器。
        可以指定地区发射多枚武器。
*/

public class Test2 {
    public static void main(String[] args) {
        fire();
        fire("某国");
        fire("某某国",10);
    }
    //默认发一枚武器
    public static void fire() {
        System.out.println("发射了一枚武器");
    }
    //指定地区发射一枚武器。
    public static void fire(String area) {
        fire(area,1);
    }
    //指定地区发射多枚武器。
    public static void fire(String area, int n) {
        System.out.println("向" + area + "发射了" + n + "枚武器");
    }
}
