package com.se.study06.Demo7_arraylist_test2;

//在外卖系统中，每一份菜都包含，菜品的名称、菜品的原价、菜品的优惠价、菜品的其他信息。那我们就可以定义一个菜品类（Food类），用来描述每一个菜品对象要封装那些数据
public class Food {
    private String name;
    private double price;
    private double specialPrice;
    private String info;

    public Food() {
    }

    public Food(String name, double price, double specialPrice, String info) {
        this.name = name;
        this.price = price;
        this.specialPrice = specialPrice;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
