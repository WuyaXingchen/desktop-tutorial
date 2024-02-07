package com.se.study06.Demo7_arraylist_test2;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodManager {
    private ArrayList<Food> foods = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //1、商家上架菜品
    public void add() {
        System.out.println("===菜品上架==");
        Food food = new Food();
        System.out.println("请您输入上架菜品的名称：");
        String name = sc.next();
        food.setName(name);

        System.out.println("请您输入上架菜品的原价：");
        double price = sc.nextDouble();
        food.setPrice(price);

        System.out.println("请您输入上架菜品的优惠价：");
        double specialPrice = sc.nextDouble();
        food.setSpecialPrice(specialPrice);

        System.out.println("请您输入上架菜品的其他信息：");
        String info = sc.next();
        food.setInfo(info);

        foods.add(food);
        System.out.println("恭喜您，上架成功~~~");
    }

    //2、菜品；浏览功能
    public void printAllFoods() {
        System.out.println("==当前菜品信息如下：==");
        for (int i = 0; i < foods.size(); i++) {
            Food food = foods.get(i);
            System.out.println("菜品名称：" + food.getName());
            System.out.println("菜品原价：" + food.getPrice());
            System.out.println("菜品优惠价：" + food.getSpecialPrice());
            System.out.println("其他描述信息：" + food.getInfo());
            System.out.println("------------------------");
        }
    }

    //3、专门负责展示系统界面的
    public void start() {
        while (true) {
            System.out.println("====欢迎进入商家后台管理系统=====");
            System.out.println("1、上架菜品（add）");
            System.out.println("2、浏览菜品（query）");
            System.out.println("3、退出系统（exit）");
            System.out.println("请您选择操作命令（add、query、exit）：");
            String command = sc.next();
            switch (command) {
                case "add":
                    add();
                    break;
                case "query":
                    printAllFoods();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("您输入的操作命令有误~~");
            }
        }
    }
}
