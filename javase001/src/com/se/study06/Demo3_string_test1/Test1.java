package com.se.study06.Demo3_string_test1;

import java.util.Scanner;

//1.首先，从登录界面上可以得出，需要让用户输入登录名和密码
//2.设计一个登录方法，对用户名和密码进行校验
//3.调用登录方法，根据方法的返回结果，判断登录是否成功。
//4.如果登录失败，循环登录3次，结束循环；如果登录成功，跳出循环;
public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登录名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            boolean rs =Login(name,password);
            if (rs) {
                System.out.println("登录成功欢迎");
                return;
            } else {
                System.out.println("出错了，请重试");
            }
        }
        System.out.println("出错3次，系统关闭");
    }

    public static boolean Login(String name, String password) {
        String rightName="乌鸦wuya";
        String rightPassword="123456";
        return rightName.equals(name)&&rightPassword.equals(password);
    }
}
