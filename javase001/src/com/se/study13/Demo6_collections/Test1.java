package com.se.study13.Demo6_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T> c, T...e)给集合批量添加元素
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "李四", "王五");
        System.out.println(names);

        //2.public static void shuffle(List<?> list)：对集合打乱顺序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void short(List<T list): 对List集合排序
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
    }
}
