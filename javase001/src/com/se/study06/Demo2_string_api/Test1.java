package com.se.study06.Demo2_string_api;

public class Test1 {
    public static void main(String[] args) {
        //目标：快速熟悉String提供的处理字符串的常用方法。
        String rs1 = "乌鸦java";

        // 1、获取字符串的长度
        System.out.println("-----1、获取字符串的长度-----");
        int length = rs1.length();
        System.out.println(length);

        // 2、提取字符串中某个索引位置处的字符
        System.out.println("-----2、提取字符串中某个索引位置处的字符-----");
        char c = rs1.charAt(1);
        System.out.println(c);

        //    字符串的遍历
        System.out.println("-----字符串的遍历-----");
        for (int i = 0; i < rs1.length(); i++) {
            c = rs1.charAt(i);
            System.out.print(c);
        }
        System.out.println();

        // 3、把字符串转换成字符数组，再进行遍历
        System.out.println("-----3、把字符串转换成字符数组，再进行遍历-----");
        char[] chars = rs1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        // 4、判断字符串内容，内容一样就返回true
        System.out.println("-----4、判断字符串内容，内容一样就返回true-----");
        String rs2 = new String("乌鸦java");
        String rs3 = new String("乌鸦jvav");
        System.out.println(rs1.equals(rs2));
        System.out.println(rs1.equals(rs3));
        System.out.println(rs1 == rs2);

        // 5、忽略大小写比较字符串内容
        System.out.println("-----5、忽略大小写比较字符串内容-----");
        String rs4 = "123ab4c";
        String rs5 = "123AB4c";
        System.out.println(rs4.equalsIgnoreCase(rs5));
        System.out.println(rs4.equals(rs5));

        // 6、截取字符串内容 (包前不包后的)
        System.out.println("-----6、截取字符串内容 (包前不包后的)-----");
        String rs6 = rs1.substring(1, 3);
        System.out.println(rs6);

        // 7、从当前索引位置一直截取到字符串的末尾
        System.out.println("-----7、从当前索引位置一直截取到字符串的末尾-----");
        String rs7 = rs1.substring(2);
        System.out.println(rs7);

        // 8、把字符串中的某个内容替换成新内容，并返回新的字符串对象
        System.out.println("-----8、把字符串中的某个内容替换成新内容，并返回新的字符串对象-----");
        String rs8 = "这是一段测试内容";
        String rs9 = rs8.replace("试内", "**");
        System.out.println(rs9);

        // 9、判断字符串中是否包含某个关键字
        System.out.println("-----9、判断字符串中是否包含某个关键字-----");
        System.out.println(rs8.contains("段测"));
        System.out.println(rs8.contains("段试"));

        // 10、判断字符串是否以某个字符串开头
        System.out.println("-----10、判断字符串是否以某个字符串开头-----");
        System.out.println(rs8.startsWith("这是"));
        System.out.println(rs8.startsWith("这是是"));


        // 11、把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回
        System.out.println("-----11、把字符串按照某个指定内容分割成多个字符串，放到一个字符串数组中返回-----");
        String rs10 = "张三1111李四1111王五1111";
        String[] rs = rs10.split("1111");
        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }
    }
}
