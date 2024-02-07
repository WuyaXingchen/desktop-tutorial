package com.se.study18.Demo1_thread;

public class Test1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.setName("1号线程"); //设置线程名称;
        t1.start();
        System.out.println(t1.getName());  //Thread-0

        Thread t2 = new MyThread("2号线程");
        // t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName()); // Thread-1

        Thread m = Thread.currentThread();
        m.setName("主线程");
        System.out.println(m.getName()); // main

        for (int i = 1; i <= 5; i++) {
            System.out.println(m.getName() + "线程输出：" + i);
        }
    }
}
