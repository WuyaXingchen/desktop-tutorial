package com.se.study17.Demo3_runnable;

public class Test1 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        //  public Thread(Runnable target)
        new Thread(target).start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("主线程main输出 ===》" + i);
        }
    }
}
