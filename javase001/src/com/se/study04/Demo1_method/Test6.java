package com.se.study04.Demo1_method;

public class Test6 {
    public static void main(String[] args) {
        //需求：比较两个int类型的数组是否一样，返回true或者false
        int[] array1={10,20,30};
        int[] array2={10,20,30};
        int[] array3={1,2,4};
        int[] array4={10,20,30,40};
        System.out.println(equals(array1, array2));
        System.out.println(equals(array1, array3));
        System.out.println(equals(array1, array4));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        // 1、判断arr1和arr2是否都是null.
        if (arr1==null&&arr2==null)
            return true;
        // 2、判断arr1是null，或者arr2是null.
        else if (arr1==null||arr2==null)
            return false;
        // 3、判断2个数组的长度是否一样，如果长度不一样，直接返回false.
        else if (arr1.length!=arr2.length)
            return false;
        // 4、两个数组的长度是一样的，接着比较它们的内容是否一样。
        else{
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!=arr2[i])
                    return false;
            }
            return true;
        }
    }
}
