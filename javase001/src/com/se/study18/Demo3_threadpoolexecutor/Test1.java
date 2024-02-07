package com.se.study18.Demo3_threadpoolexecutor;

import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(
                3,    //核心线程数有3个
                5,  //最大线程数有5个。   临时线程数=最大线程数-核心线程数=5-3=2
                8,    //临时线程存活的时间8秒。 意思是临时线程8秒没有任务执行，就会被销毁掉。
                TimeUnit.SECONDS,//时间单位（秒）
                new ArrayBlockingQueue<>(4), //任务阻塞队列，没有来得及执行的任务在，任务队列中等待
                Executors.defaultThreadFactory(), //用于创建线程的工厂对象
                new ThreadPoolExecutor.CallerRunsPolicy() //拒绝策略
        );

        Runnable target = new MyRunnable();
        pool.execute(target); // 线程池会自动创建一个新线程，自动处理这个任务，自动执行的！
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
    }
}
