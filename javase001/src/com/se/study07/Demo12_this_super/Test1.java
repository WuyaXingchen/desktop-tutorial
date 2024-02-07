package com.se.study07.Demo12_this_super;

//子类中访问成员
//在子类中访问其他成员（成员变量、成员方法），是依据就近原则的
//	this.成员变量	    访问本类成员变量
//	this.成员方法	    调用本类成员方法
//	super.成员变量	访问父类成员变量
//	super.成员方法	调用父类成员方法
public class Test1 {
    public static void main(String[] args) {
        Z z = new Z();
        z.showName();
        z.show();
    }
}

class F {
    String name = "父类名称";

    public void print() {
        System.out.println("==父类的print方法执行==");
    }
}

class Z extends F {
    String name = "子类名称";

    public void showName() {
        String name = "局部名称";
        System.out.println(name); // 局部名称
        System.out.println(this.name); //子类名称
        System.out.println(super.name); //父类名称
    }

    @Override
    public void print() {
        System.out.println("~~子类print方法执行~~");
    }

    public void show() {
        print();
        super.print();
    }
}
