package com.se.study18.Demo3_threadpoolexecutor;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ==> 输出666~~");
        //为了模拟线程一直在执行，这里睡久一点
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
