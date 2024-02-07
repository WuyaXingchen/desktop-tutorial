package com.se.study09.Demo4_generics;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //1.集合中的元素不管是什么类型，test1方法都能接收
        ArrayList<BWN> list1 = new ArrayList<>();
        ArrayList<BENZ> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        test1(list1);
        test1(list2);
        test1(list3);

        //2.集合中的元素只能是Car或者Car的子类类型，才能被test2方法接收
        ArrayList<Car> list4 = new ArrayList<>();
        ArrayList<BWN> list5 = new ArrayList<>();
        test2(list4);
        test2(list5);

        //2.集合中的元素只能是Car或者Car的父类类型，才能被test3方法接收
        ArrayList<Car> list6 = new ArrayList<>();
        ArrayList<Object> list7 = new ArrayList<>();
        test3(list6);
        test3(list7);
    }

    public static void test1(ArrayList<?> list) {

    }

    public static void test2(ArrayList<? extends Car> list) {

    }

    public static void test3(ArrayList<? super Car> list) {

    }
}

class Car {
}

class BENZ extends Car {
}

class BWN extends Car {
}