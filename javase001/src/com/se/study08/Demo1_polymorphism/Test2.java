package com.se.study08.Demo1_polymorphism;

//如果p接收的是子类对象
//父类变量 instanceof 子类
public class Test2 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        go(t);
        Student s = new Student();
        go(s);


    }

    public static void go(People p) {
        System.out.println("-----开始-----");
        p.run();
        //在多态形式下，不能调用子类特有的方法
        //p.teach();
        //p.study();
        if (p instanceof Student) {
            Student s = (Student) p;
            s.study();
        } else {
            Teacher t = (Teacher) p;
            t.teach();
        }
        System.out.println("-----结束-----");
    }
}
