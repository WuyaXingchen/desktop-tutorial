package com.se.study13.Demo1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        //无序、无索引、不重复
        Set<Integer> set1=new HashSet<>();
        set1.add(444);
        set1.add(333);
        set1.add(111);
        set1.add(222);
        set1.add(333);
        System.out.println(set1);

        //有序、无索引、不重复
        Set<Integer> set2=new LinkedHashSet<>();
        set2.add(444);
        set2.add(333);
        set2.add(111);
        set2.add(222);
        set2.add(333);
        System.out.println(set2);

        //可排序(升序)、无索引、不重复
        Set<Integer> set3=new TreeSet<>();
        set3.add(444);
        set3.add(333);
        set3.add(111);
        set3.add(222);
        set3.add(333);
        System.out.println(set3);
    }
}
