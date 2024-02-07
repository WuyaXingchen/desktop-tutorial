package com.se.study16.Demo5_bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test1 {
    public static void main(String[] args) {
        try (
                Writer fw = new FileWriter("src/test03out.txt");
                BufferedWriter bw=new BufferedWriter(fw);
        ) {
            bw.write('a');
            bw.write(97);
            bw.write('我');
            bw.newLine();

            bw.write("一段测试语句abc");
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
