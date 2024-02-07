package com.se.study16.Demo4_bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("src\\test.txt");
                // 创建一个字符缓冲输入流包装原始的字符输入流
                BufferedReader br = new BufferedReader(fr);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
