package com.se.study04.Demo1_method;

public class Test2 {
    public static void main(String[] args) {
        //需求1：写一个方法，打印3个"Hello World"
        System.out.println("打印3个Hello World");
        printHelloWorld();
        printHelloWorld();
        printHelloWorld();
        System.out.println("---------------------");
        //需求2：写一个方法，打印若干个"Hello World"，具体多少个，有调用者指定
        System.out.println("指定n=1,打印1个Hello World");
        printHelloWorld(1);
        System.out.println("指定n=5,打印5个Hello World");
        printHelloWorld(5);
    }
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static void printHelloWorld(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}
