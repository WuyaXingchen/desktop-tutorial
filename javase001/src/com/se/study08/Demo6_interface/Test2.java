package com.se.study08.Demo6_interface;

public class Test2 {
    public static void main(String[] args) {
        Singer s = new S();
        s.sing();
        Driver d = new S();
        d.drive();
    }
}

class Student {
}

interface Singer {
    void sing();
}

interface Driver {
    void drive();
}

class S extends Student implements Singer, Driver {

    @Override
    public void sing() {

    }

    @Override
    public void drive() {

    }
}
