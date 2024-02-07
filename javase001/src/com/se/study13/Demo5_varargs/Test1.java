package com.se.study13.Demo5_varargs;

import java.util.Arrays;

//可变参数
//一个形参列表中，只能有一个可变参数；否则会报错(int... nums,int... nums2)X
//一个形参列表中如果多个参数，可变参数需要写在最后；否则会报错(int... nums,int n)X
public class Test1 {
    public static void main(String[] args) {
        test();
        test(10, 20, 30);
        int[] arr = {10, 20, 30, 40, 50};
        test(arr);
    }

    public static void test(int... nums) {
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("-------------------");
    }
}
