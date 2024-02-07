package com.se.study17.Demo1_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // 1、创建Properties对象出来，先用它存储一些键值对数据
        Properties properties = new Properties();
        properties.setProperty("张三", "123");
        properties.setProperty("李四", "321");
        properties.setProperty("王五", "456");

        // 2、把properties对象中的键值对数据存入到属性文件中去
        properties.store(new FileWriter("src/users2.properties")
                , "i saved many users!");
    }
}
