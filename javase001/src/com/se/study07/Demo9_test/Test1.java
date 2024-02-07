package com.se.study07.Demo9_test;

import com.se.study07.Demo9_private_public_protected.Fu;

public class Test1 {
    public static void main(String[] args) {
        Fu f = new Fu();
        // f.privateMethod(); // 报错
        // f.method();		  //报错
        // f.protecedMethod();//报错
        f.publicMethod();	//正确

        Zi zi = new Zi();
        // zi.protectedMethod();
    }
}
