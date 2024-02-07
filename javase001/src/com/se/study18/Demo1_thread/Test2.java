package com.se.study18.Demo1_thread;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        // join方法作用：让当前调用这个方法的线程先执行完。
        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("2号线程");
        t2.start();
        t2.join();

        Thread t3 = new MyThread("3号线程");
        t3.start();
        t3.join();
    }
}
