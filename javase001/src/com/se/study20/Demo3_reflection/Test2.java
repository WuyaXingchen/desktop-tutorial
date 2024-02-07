package com.se.study20.Demo3_reflection;

import java.lang.reflect.Constructor;

public class Test2 {
    public static void main(String[] args) {
        //1、反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;

        //2、获取类的全部构造器
        Constructor[] constructors = c.getDeclaredConstructors();
        //3、遍历数组中的每一个构造器对象。
        for(Constructor constructor: constructors){
            System.out.println(constructor.getName()+"---> 参数个数："+constructor.getParameterCount());
        }
    }
}
