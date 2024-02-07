package com.se.study12.Demo1_excpetion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//1.throws
public class Test1 {
    public static void main(String[] args) throws ParseException {
        //2.try...catch
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2028-11-11 10:24");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
