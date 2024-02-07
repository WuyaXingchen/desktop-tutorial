package com.se.study15.Demo3_fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个字节输出流管道与目标文件接通。
        // 覆盖管道：覆盖之前的数据
        //OutputStream os =
        //        new FileOutputStream("src/testout.txt");

        // 追加数据的管道
        OutputStream os=
                new FileOutputStream("src/testout.txt",true);

        os.write(97);
        os.write('b');
        //os.write('我');// 默认只能写出去一个字节

        byte[] bytes="这是测试语句123abc".getBytes();
        os.write(bytes);

        os.write(bytes,0,18);

        //换行符
        os.write("\r\n".getBytes());

        os.close();
    }
}
