package com.se.study02.Demo4_while;

public class Test1 {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;

        while (paperThickness < peakHeight) {
            paperThickness = paperThickness * 2;
            count++;
        }
        System.out.println("需要折叠多少次：" + count);
        System.out.println("最终纸张的厚度是：" + paperThickness);
    }
}
