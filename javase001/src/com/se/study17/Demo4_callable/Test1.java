package com.se.study17.Demo4_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> call = new MyCallable(100);
        FutureTask<String> f1 = new FutureTask<>(call);

        new Thread(f1).start();

        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        new Thread(f2).start();

        String rs = f1.get();
        System.out.println(rs);

        String rs2 = f2.get();
        System.out.println(rs2);
    }
}
