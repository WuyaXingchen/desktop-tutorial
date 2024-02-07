package com.se.study18.Demo2_synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId; // 卡号
    private double money; // 余额。

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    // 小明 小红同时过来的
//    public void drawMoney(double money) {
//        // 先搞清楚是谁来取钱？
//        String name = Thread.currentThread().getName();
//        // 1、判断余额是否足够
//        // this正好代表共享资源！
//        synchronized (this) {
//            if(this.money >= money){
//                System.out.println(name + "来取钱" + money + "成功！");
//                this.money -= money;
//                System.out.println(name + "来取钱后，余额剩余：" + this.money);
//            }else {
//                System.out.println(name + "来取钱：余额不足~");
//            }
//        }
//    }
    private final Lock lk = new ReentrantLock();
    public void drawMoney(double money) {
        // 先搞清楚是谁来取钱？
        String name = Thread.currentThread().getName();
        try {
            lk.lock(); // 加锁
            // 1、判断余额是否足够
            if(this.money >= money){
                System.out.println(name + "来取钱" + money + "成功！");
                this.money -= money;
                System.out.println(name + "来取钱后，余额剩余：" + this.money);
            }else {
                System.out.println(name + "来取钱：余额不足~");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lk.unlock(); // 解锁
        }
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
