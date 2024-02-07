package com.se.study17.Demo2_thread;

public class Test1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程main输出：" + i);
        }
    }
}
