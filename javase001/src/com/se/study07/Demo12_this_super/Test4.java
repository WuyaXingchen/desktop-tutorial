package com.se.study07.Demo12_this_super;

//this(): 调用本类的空参数构造器
//this(参数): 调用本类有参数的构造器
public class Test4 {
    public static void main(String[] args) {
        Student s = new Student("张三", 21, "家里蹲大学");
        //默认xx大学
        Student s1 = new Student("李四", 22);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getSchoolName());
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSchoolName());
    }
}

class Student {
    private String name;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age) {
        this(name, age, "xx大学");
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
