package com.se.study13.Demo7_map;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 1; i <= 80; i++) {
            int index = r.nextInt(4);
            data.add(selects[index]);
        }
        System.out.println(data);

        // 准备一个Map集合用于统计最终的结果
        Map<String, Integer> result = new HashMap<>();

        for (String s : data) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        System.out.println(result);
    }
}
