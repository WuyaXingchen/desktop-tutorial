package com.se.study20.Demo3_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
    public static void main(String[] args) throws Exception {
        Class c = Cat.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }

        Field fName = c.getDeclaredField("name");
        System.out.println(fName.getName() + "--->" + fName.getType());

        Field fAge = c.getDeclaredField("age");
        System.out.println(fAge.getName() + "--->" + fAge.getType());

        Cat cat=new Cat();
        fName.setAccessible(true);
        fName.set(cat,"小猫");
        System.out.println(cat);

        String name=(String) fName.get(cat);
        System.out.println(name);

        //获取类中的全部成员方法
        Method[] methods = c.getDeclaredMethods();

        //遍历这个数组中的每一个方法对象
        for(Method method : methods){
            System.out.println(method.getName()+"-->"+method.getParameterCount()+"-->"+method.getReturnType());
        }

        System.out.println("-----------------------");
        //获取private修饰的run方法，得到Method对象
        Method run = c.getDeclaredMethod("run");
        //执行run方法,在执行前需要取消权限检查
        Cat cat1 = new Cat();
        run.setAccessible(true);
        Object rs1 = run.invoke(cat1);
        System.out.println(rs1);

        //获取private 修饰的eat(String name)方法，得到Method对象
        Method eat = c.getDeclaredMethod("eat",String.class);
        eat.setAccessible(true);
        Object rs2 = eat.invoke(cat1,"鱼儿");
        System.out.println(rs2);
    }
}
