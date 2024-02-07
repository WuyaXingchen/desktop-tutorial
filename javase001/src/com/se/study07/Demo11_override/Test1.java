package com.se.study07.Demo11_override;

//1.重写的方法上面，可以加一个注解@Override,用于标注这个方法是复写的父类方法
//2.子类复写父类方法时，访问权限必须大于或者等于父类方法的权限
//public > protected > 缺省
//3. 重写的方法返回值类型，必须与被重写的方法返回值类型一样，或者范围更小
//私有方法、静态方法不能被重写，如果重写会报错。
public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        b.print1();
        b.print2(1, 2);
    }
}
