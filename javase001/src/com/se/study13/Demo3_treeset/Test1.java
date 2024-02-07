package com.se.study13.Demo3_treeset;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(9);
        set1.add(1);
        set1.add(8);
        set1.add(2);
        set1.add(7);
        set1.add(3);
        set1.add(6);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        Set<String> set2 = new TreeSet<>();
        set2.add("a");
        set2.add("c");
        set2.add("e");
        set2.add("b");
        set2.add("d");
        set2.add("f");
        set2.add("g");
        System.out.println(set2);
    }
}
