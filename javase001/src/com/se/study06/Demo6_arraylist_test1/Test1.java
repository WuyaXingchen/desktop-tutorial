package com.se.study06.Demo6_arraylist_test1;

import java.util.ArrayList;

//购物车中包含Java入门、宁夏枸杞、黑枸杞、人字拖、特级枸杞、枸杞子，用户要批量删除包含枸杞的物品
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String rs = list.get(i);
            if (rs.contains("枸杞")) {
                System.out.println(list.remove(i));
                i--;
            }
        }
        System.out.println(list);
    }
}
