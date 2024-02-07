package com.se.study16.Demo11_objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test2 {
    public static void main(String[] args) {
        try (
                // 1、创建一个对象字节输入流管道，包装 低级的字节输入流与源文件接通
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/test08out.txt"));
        ) {
            User u = (User) ois.readObject();
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
