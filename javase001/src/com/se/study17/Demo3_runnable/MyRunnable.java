package com.se.study17.Demo3_runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("子线程输出 ===》" + i);
        }
    }
}
