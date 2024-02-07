package com.se.study16.Demo1_filereader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("src\\test.txt");
        ) {
            char[] chars = new char[3];
            int len;
            while ((len = fr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
