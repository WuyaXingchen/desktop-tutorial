package com.se.study09.Demo4_generics;

//自定义泛型类
public class Test1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("张三");
        list.add("李四");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(10);
        list1.add(30);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
    }
}
