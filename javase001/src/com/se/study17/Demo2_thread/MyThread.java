package com.se.study17.Demo2_thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程MyThread输出：" + i);
        }
    }
}
