package com.se.study04.Demo1_method;

public class Test5 {
    public static void main(String[] args) {
        //需求：输出一个int类型的数组内容，要求输出格式为：[11, 22, 33, 44, 55]。
        int[] array1 = {11, 22, 33, 44, 55};
        printArray(array1);

        int[] array2 = null;
        printArray(array2);

        int[] array3 = {};
        printArray(array3);
    }

    public static void printArray(int[] a) {
        if (a == null) {
            System.out.println(a);
            return;
        }

        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }
}
