package com.se.study13.Demo7_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test3 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("小张", 169.8);
        map.put("小李", 165.8);
        map.put("小王", 169.5);
        map.put("小明", 183.6);
        System.out.println(map);

        //遍历方式1：键找值
        Set<String> keys = map.keySet();
        for (String key : keys) {
            double value = map.get(key);
            System.out.println(key + "==>" + value);
        }
        //遍历方式2：键值对。
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "--->" + value);
        }
        //遍历方式3:forEach
        map.forEach(new BiConsumer<String, Double>() {
            @Override
            public void accept(String k, Double v) {
                System.out.println(k + "~~~>" + v);
            }
        });
        //Lambda
        map.forEach((k, v) -> {
            System.out.println(k + "···>" + v);
        });
    }
}
