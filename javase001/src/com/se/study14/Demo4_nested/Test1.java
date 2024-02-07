package com.se.study14.Demo4_nested;

import java.util.*;
import java.util.function.BiConsumer;

public class Test1 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        map.put("江苏省", cities1);

        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        map.put("湖北省", cities2);

        List<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");
        map.put("河北省", cities3);

        System.out.println(map);

        List<String> cities = map.get("江苏省");
        for (String city : cities) {
            System.out.println(city);
        }

        map.forEach(new BiConsumer<String, List<String>>() {
            @Override
            public void accept(String p, List<String> c) {
                System.out.println(p + "----->" + c);
            }
        });
        map.forEach((p, c) -> {
            System.out.println(p + "=====>" + c);
        });
    }
}
