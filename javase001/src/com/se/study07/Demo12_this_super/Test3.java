package com.se.study07.Demo12_this_super;

//super():调用父类空参数构造器
//super(参数):调用父类有参数构造器
public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三", 30, "Java");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
    }
}

class Teacher extends People {
    private String skill;

    public Teacher(String name, int age, String skill) {
        super(name, age);//调用了父类的有参构造器
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
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
}
