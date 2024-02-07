package com.se.study10.Demo2_stringjoiner;

import java.util.StringJoiner;

public class Test2 {
    public static void main(String[] args) {
        String str = getArrayData(new int[]{11, 22, 33});
        System.out.println(str);
    }

    //将int数组转换为指定格式的字符串
    public static String getArrayData(int[] arr) {
        if (arr == null)
            return null;
        StringJoiner s = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            ////加"String.valueOf"是因为add方法的参数要的是String类型
            s.add(String.valueOf(arr[i]));
        }
        return s.toString();
    }
}
