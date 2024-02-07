package com.se.study18.Demo3_threadpoolexecutor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    // 2、重写call方法
    @Override
    public String call() throws Exception {
        // 需求：求1-n的和返回。
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "求出了1-" + n + "的和是：" + sum;
    }
}
