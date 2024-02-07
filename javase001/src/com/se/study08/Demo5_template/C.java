package com.se.study08.Demo5_template;

// 模板方法设计模式
public abstract class C {
    // 模板方法
    public final void sing() {
        System.out.println("开始唱");
        doSing();
        System.out.println("唱完了");
    }

    public abstract void doSing();
}
