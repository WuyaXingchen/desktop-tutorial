package com.se.study17.Demo1_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个Properties的对象出来（键值对集合，空容器）
        Properties properties = new Properties();
        System.out.println(properties);

        // 2、开始加载属性文件中的键值对数据到properties对象中去
        properties.load(new FileReader("src\\users.properties"));

        // 3、根据键取值
        System.out.println(properties.getProperty("zhangsan"));
        System.out.println(properties.getProperty("张三"));

        // 4、遍历全部的键和值
        //获取键的集合
        Set<String> keys = properties.stringPropertyNames();
        for (String key : keys) {
            //再根据键获取值
            String value = properties.getProperty(key);
            System.out.println(key + "---->" + value);
        }

        properties.forEach((k, v) -> {
            System.out.println(k + "---->" + v);
        });
    }
}
