package com.se.study12.Demo2_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        System.out.println(c);
        //迭代器遍历
        //解释：Iterator就是迭代器对象，用于遍历集合的工具)
        Iterator<String> it = c.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        //使用增强for遍历集合
        for (String s:c)
            System.out.println(s);

        String[] arr={"哈哈","呵呵","嘿嘿"};
        for (String s1:arr)
            System.out.println(s1);

        //forEach遍历集合
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //Lambda简化
        c.forEach(s ->System.out.println(s));
    }
}
