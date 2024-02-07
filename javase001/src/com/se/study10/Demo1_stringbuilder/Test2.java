package com.se.study10.Demo1_stringbuilder;

public class Test2 {
    public static void main(String[] args) {
        String str = getArrayData(new int[]{11, 22, 33});
        System.out.println(str);
    }

    //将int数组转换为指定格式的字符串
    public static String getArrayData(int[] arr) {
        if (arr == null)
            return null;
        StringBuffer s = new StringBuffer("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                s.append(arr[i]).append("]");
            else
                s.append(arr[i]).append(",");
        }
        return s.toString();
    }
}
