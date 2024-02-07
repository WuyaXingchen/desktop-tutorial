package com.se.study14.Demo2_linkedhashmap;

import java.util.LinkedHashMap;

//LinkedHashMap有序的、不重复、无索引。
public class Test1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); //  按照键 有序，不重复，无索引。
        map.put("手表", 100);
        map.put("手表", 220);
        map.put("手机", 2);
        map.put("Java", 2);
        map.put(null, null);
        System.out.println(map);
    }
}
