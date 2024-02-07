package com.se.study14.Demo5_stream;

import java.util.*;
import java.util.stream.Stream;

//Stream流的创建
public class Test1 {
    public static void main(String[] args) {
        // 1、如何获取List集合的Stream流？
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "小张", "小李", "小王", "小明", "小红");
        Stream<String> stream1 = names.stream();

        // 2、如何获取Set集合的Stream流？
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "小张", "小李", "小王", "老张", "老李");
        Stream<String> stream2 = set.stream();
        stream2.filter(s -> s.contains("李")).forEach(s -> System.out.println(s));

        // 3、如何获取Map集合的Stream流？
        Map<String, Double> map = new HashMap<>();
        map.put("小张", 172.3);
        map.put("小李", 168.3);
        map.put("小王", 166.3);
        map.put("老张", 168.3);

        Set<String> keys = map.keySet();
        Stream<String> ks = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> es = entries.stream();
        es.filter(e -> e.getKey().contains("小")).forEach(e -> System.out.println(e.getKey() + "--->" + e.getValue()));

        // 4、如何获取数组的Stream流？
        String[] name = {"小张", "小李", "小王", "老张", "老李"};
        Stream<String> s1 = Arrays.stream(name);
        Stream<String> s2 = Stream.of(name);
    }
}
