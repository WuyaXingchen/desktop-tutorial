package com.se.study07.Demo11_override;

//子类可以重写一个方法名称、参数列表一样的方法，去覆盖父类的这个方法，这就是方法重写
public class B extends A {
    @Override
    public void print1() {
        System.out.println("222");
    }

    @Override
    public void print2(int i, int j) {
        System.out.println("222222");
    }
}
