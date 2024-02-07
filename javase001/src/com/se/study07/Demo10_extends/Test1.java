package com.se.study07.Demo10_extends;

public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
    }
}

class A {
}//extends Object{}

class B extends A {
}

//class C extends A, B {}//报错
class C extends B {
}

