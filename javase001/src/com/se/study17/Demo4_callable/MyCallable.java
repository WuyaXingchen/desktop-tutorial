package com.se.study17.Demo4_callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "线程求出了1-" + n + "的和是" + sum;
    }
}
