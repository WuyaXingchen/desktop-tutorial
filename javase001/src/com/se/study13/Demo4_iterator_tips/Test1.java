package com.se.study13.Demo4_iterator_tips;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小张");
        list.add("小李");
        list.add("小王");
        list.add("老张");
        list.add("老李");
        list.add("老王");
        System.out.println(list);

        //需求：找出集合中带"李"字的姓名，并从集合中删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("李"))
                //list.remove(name);    //报错
                it.remove();            //当前迭代器指向谁，就删除谁
        }
        System.out.println(list);
    }
}
