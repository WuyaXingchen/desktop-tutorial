package com.se.study16.Demo8_print;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Test1 {
    public static void main(String[] args) {
        try (
                // 1、创建一个打印流管道
                //PrintStream ps =
                //new PrintStream("io-app2/src/itheima08.txt", Charset.forName("GBK"));
                //PrintStream ps =
                //new PrintStream("io-app2/src/itheima08.txt");
                PrintWriter ps =
                        new PrintWriter(new FileOutputStream("src/test05.txt", true));
        ) {
            ps.print(97);    //文件中显示的就是:97
            ps.print('a'); //文件中显示的就是:a
            ps.println("测试abc");    //文件中显示的就是:测试abc
            ps.println(true);//文件中显示的就是:true
            ps.println(99.5);//文件中显示的就是99.5

            ps.write(97); //文件中显示a，发现和前面println方法的区别了吗？

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
