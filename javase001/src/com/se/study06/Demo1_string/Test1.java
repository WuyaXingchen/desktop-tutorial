package com.se.study06.Demo1_string;

public class Test1 {
    public static void main(String[] args) {
        String name = "乌鸦666";
        System.out.println(name);

        String rs1 = new String();
        System.out.println(rs1);

        String rs2 = new String("wuya");
        System.out.println(rs2);

        char[] c = {'w', 'u', '乌', '鸦'};
        String rs3 = new String(c);
        System.out.println(rs3);

        byte[] bytes = {119, 117, 121, 97};
        String rs4 = new String(bytes);
        System.out.println(rs4);
    }
}
