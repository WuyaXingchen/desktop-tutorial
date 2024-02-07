package com.se.study07.Demo12_this_super;

//子类中访问构造器的语法规则
//子类全部构造器，都会先调用父类构造器，再执行自己
public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        Zi z2 = new Zi("张三");
    }
}

class Fu {
    public Fu() {
        System.out.println("父类的==无参构造器==执行了");
    }
}

class Zi extends Fu {
    public Zi() {
        //super();//默认存在
        System.out.println("子类的~~无参构造器~~执行了");
    }

    public Zi(String name) {
        //super();//默认存在
        System.out.println("子类的~~有参构造器~~执行了");
    }
}
