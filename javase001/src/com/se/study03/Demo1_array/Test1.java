package com.se.study03.Demo1_array;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {20,10,80,60,90};
        String[] names = {"张三", "李四", "王五"};
        //定义数组，用来存储多个年龄
        int[] ages = new int[]{12, 24, 36};
        //定义数组，用来存储多个成绩
        double[] scores = new double[]{89.9, 99.5, 59.5, 88.0};
        int[] ages1 = {12, 24, 36};
        int ages2[] = {12, 24, 36};
        int[] arr = {12, 24, 36};
        System.out.println(arr[0]); //12
        System.out.println(arr[1]); //24
        System.out.println(arr[2]); //36
        arr[0] = 66;
        arr[2] = 100;
        System.out.println(arr.length);
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
