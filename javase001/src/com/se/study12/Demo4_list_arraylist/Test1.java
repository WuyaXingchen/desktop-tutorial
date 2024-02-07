package com.se.study12.Demo4_list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合对象（有序、有索引、可以重复）
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);

        //2.public void add(int index, E element): 在某个索引位置插入元素
        list.add(2, "张三");
        System.out.println(list);

        //3.public E remove(int index): 根据索引删除元素, 返回被删除的元素
        System.out.println(list.remove(2));
        System.out.println(list);

        //4.public E get(int index): 返回集合中指定位置的元素
        System.out.println(list.get(2));

        //5.public E set(int index, E e): 修改索引位置处的元素，修改后，会返回原数据
        System.out.println(list.set(2, "王二"));
        System.out.println(list);

        //1.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2.增强for遍历
        for (String s : list) {
            System.out.println(s);
        }

        //3.迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        //4.Lambda表达式forEach遍历
        list.forEach(s -> System.out.println(s));
    }
}
