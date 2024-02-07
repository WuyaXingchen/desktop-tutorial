package com.se.study14.Demo6_file;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        // 1、public boolean createNewFile()：创建一个新文件（文件内容为空），创建成功返回true
        File f1 = new File("C:/Users/31045/Desktop/test/abc.txt");
        System.out.println(f1.createNewFile());

        // 2、public boolean mkdir()：用于创建文件夹，注意：只能创建一级文件夹
        File f2 = new File("C:/Users/31045/Desktop/test/abc");
        System.out.println(f2.mkdir());

        // 3、public boolean mkdirs()：用于创建文件夹，注意：可以创建多级文件夹
        File f3 = new File("C:/Users/31045/Desktop/test/bbb/ccc/ddd");
        System.out.println(f3.mkdirs());

        // 4、public boolean delete()：删除文件，或者空文件，注意：不能删除非空文件夹。
        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}
