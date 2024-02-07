package com.se.study20.Demo3_reflection;

import java.lang.reflect.Constructor;

public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException {
        //1、反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;

        //2、获取类public修饰的空参数构造器
        Constructor constructor1 = c.getConstructor();
        System.out.println(constructor1.getName() + "---> 参数个数：" + constructor1.getParameterCount());

        //3、获取private修饰的有两个参数的构造器，第一个参数String类型，第二个参数int类型
        Constructor constructor2 =
                c.getDeclaredConstructor(String.class, int.class);

        System.out.println(constructor2.getName() + "---> 参数个数：" + constructor2.getParameterCount());
    }
}
