package com.se.study08.Demo8_interface_tips;

public class Test1 {
    public static void main(String[] args) {

    }
}
interface A{
    void test1();
}
interface B{
    void test2();
}
interface C{}

//比如：D接口继承C、B、A
interface D extends C, B, A{

}

//E类在实现D接口时，必须重写D接口、以及其父类中的所有抽象方法。
class E implements D{
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}