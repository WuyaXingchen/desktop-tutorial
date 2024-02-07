package com.se.study09.Demo7_wrapper;

public class Test2 {
    public static void main(String[] args) {
        //1.字符串转换为数值型数据
        String agsStr = "29";
        int i = Integer.parseInt(agsStr);

        String scoreStr = "3.14";
        double j = Double.parseDouble(scoreStr);

        //2.整数转换为字符串，以下几种方式都可以
        Integer a = 3;
        String s1 = Integer.toString(a);
        String s2 = a.toString();
        String s3 = a + "";
        String s4 = String.valueOf(a);
    }
}
