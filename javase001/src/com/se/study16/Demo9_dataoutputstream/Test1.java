package com.se.study16.Demo9_dataoutputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) {
        try (
                // 1、创建一个数据输出流包装低级的字节输出流
                DataOutputStream dos =
                        new DataOutputStream(new FileOutputStream("src/test07out.txt"))
        ) {
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("一二三666！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
