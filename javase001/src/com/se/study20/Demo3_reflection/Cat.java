package com.se.study20.Demo3_reflection;

public class Cat {
    int a;
    private String name;
    private int age;

    public Cat(){
        System.out.println("空参数构造方法执行了");
    }

    private Cat(String name, int age){
        System.out.println("有参数构造方法执行了");
        this.name=name;
        this.age=age;
    }

    private void run(){
        System.out.println("(>^ω^<)喵跑得贼快~~");
    }

    public void eat(){
        System.out.println("(>^ω^<)喵爱吃猫粮~");
    }

    private String eat(String name){
        return "(>^ω^<)喵爱吃:"+name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
