package com.se.study12.Demo2_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        //1.public boolean add(E e): 添加元素到集合
        c.add("java1");
        c.add("java2");
        c.add("java2");
        c.add("java3");
        c.add("java1");
        System.out.println(c);

        //2.public int size(): 获取集合的大小
        System.out.println(c.size());

        //3.public boolean contains(Object obj): 判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));
        System.out.println(c.contains("Java1"));

        //4.public boolean remove(E e): 删除某个元素，如果有多个重复元素只能删除第一个
        System.out.println(c.remove("java1"));
        System.out.println(c);

        //5.public void clear(): 清空集合的元素
        //c.clear();
        System.out.println(c);

        //6.public boolean isEmpty(): 判断集合是否为空 是空返回true 反之返回false
        System.out.println(c.isEmpty());

        //7.public Object[] toArray(): 把集合转换为数组
        Object[] array = c.toArray();
        System.out.println(Arrays.toString(array));

        //8.如果想把集合转换为指定类型的数组，可以使用下面的代码
        String[] array1 = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(array1));

        //9.还可以把一个集合中的元素，添加到另一个集合中
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        System.out.println(c1);
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        System.out.println(c2);
        c1.addAll(c2); //把c2集合中的全部元素，添加到c1集合中去
        System.out.println(c1);
        System.out.println(c2);
    }
}
