package com.se.study20.Demo3_reflection;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1=Cat.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());

        Class c2=Class.forName("com.se.study20.Demo3_reflection.Cat");
        System.out.println(c1 == c2);

        Cat c=new Cat();
        Class c3=c.getClass();
        System.out.println(c2 == c3);
    }
}
