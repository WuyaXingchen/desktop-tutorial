package com.se.study06.Demo5_arraylist_api;

import java.util.ArrayList;

//目标：掌握如何创建ArrayList集合的对象，并熟悉ArrayList提供的常用方法。
public class Test1 {
    public static void main(String[] args) {
        // 1、创建一个ArrayList的集合对象
        //ArrayList<String> list=new ArrayList<String>();
        // 从jdk 1.7开始才支持的
        ArrayList<String> list = new ArrayList<>();

        // 2、往集合中的某个索引位置处添加一个数据
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("李四");
        System.out.println(list);

        // 3、根据索引获取集合中某个索引位置处的值
        System.out.println(list.get(2));

        // 4、获取集合的大小（返回集合中存储的元素个数）
        System.out.println(list.size());

        // 5、根据索引删除集合中的某个元素值，会返回被删除的元素值
        System.out.println(list.remove(3));
        System.out.println(list);

        // 6、直接删除某个元素值，删除成功会返回true，反之
        // 默认删除的是第一次出现的数据的
        System.out.println(list.remove("王五"));
        System.out.println(list);

        // 7、修改某个索引位置处的数据，修改后会返回原来的值
        System.out.println(list.set(1, "乌鸦"));
        System.out.println(list);
    }
}
