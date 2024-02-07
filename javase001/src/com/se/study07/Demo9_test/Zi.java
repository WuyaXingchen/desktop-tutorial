package com.se.study07.Demo9_test;

import com.se.study07.Demo9_private_public_protected.Fu;

public class Zi extends Fu {
    //在不同包下的子类中，只能访问到public、protected修饰的方法
    public void test(){
        // privateMethod(); // 报错
        // method(); // 报错
        protectedMethod();	//正确
        publicMethod();	//正确
    }
}
