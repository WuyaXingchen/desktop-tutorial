package com.se.study09.Demo6_objects;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        String s1=null;
        String s2="wuya";

        //这里会出现NullPointerException异常，调用者不能为null
        //System.out.println(s1.equals(s2));
        //此时不会有NullPointerException异常，底层会自动先判断空
        System.out.println(Objects.equals(s1,s2));

        //判断对象是否为null，等价于==
        System.out.println(Objects.isNull(s1)); //true
        System.out.println(s1==null); //true

        //判断对象是否不为null，等价于!=
        System.out.println(Objects.nonNull(s2)); //true
        System.out.println(s2!=null); //true
    }
}
