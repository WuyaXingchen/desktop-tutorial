package com.se.study07.Demo3_utils;

import java.util.Random;

public class MyUtils {
    public static String createCode(int n) {
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rs1 = new Random();
        for (int i = 0; i < n; i++) {
            int rs2 = rs1.nextInt(data.length());
            code += data.charAt(rs2);
        }
        return code;
    }
}
