package com.se.study13.Demo7_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        //无序，不重复，无索引。
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("手表", 100);
        map1.put("手表", 220); // 后面重复的数据会覆盖前面的数据（键）
        map1.put("手机", 2);
        map1.put("Java", 2);
        map1.put(null, null);
        System.out.println(map1);

        //有序，不重复，无索引。
        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("手表", 100);
        map2.put("手表", 220);
        map2.put("手机", 2);
        map2.put("Java", 2);
        map2.put(null, null);
        System.out.println(map2);

        //可排序，不重复，无索引
        //键不能为空
        Map<String, Integer> map3 = new TreeMap<>();
        map3.put("手表", 100);
        map3.put("手表", 220);
        map3.put("手机", 2);
        map3.put("Java", 2);
        System.out.println(map3);
    }
}
