package com.se.study09.Demo5_object;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("张三", 20);
        System.out.println(s.toString());
        //默认的格式是：“包名.类名@哈希值16进制”
        //重写toString方法
        //格式Student{name='张三', age=20}

        Student s1 = new Student("赵薇",23);
        Student s2 = new Student("赵薇",23);

        //equals本身也是比较对象的地址，和"=="没有区别
        System.out.println(s1.equals(s2)); //false，重写后true
        //"=="比较对象的地址
        System.out.println(s1==s2); //false
        //重写equals方法
    }
}
