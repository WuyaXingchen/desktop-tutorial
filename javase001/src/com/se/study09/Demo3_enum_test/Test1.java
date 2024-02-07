package com.se.study09.Demo3_enum_test;

public class Test1 {
    public static void main(String[] args) {
        printInfo(Constant.BOY);
    }

    public static void printInfo(Constant c) {
        switch (c) {
            case BOY:
                System.out.println("展示一些信息给男生看");
                break;
            case GIRL:
                System.out.println("展示一些信息给女生看");
                break;
        }
    }
}
