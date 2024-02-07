package com.se.study20.Demo2_Junit;

import org.junit.*;

public class StringUtilTest {
    @Test
    @Before
    public void test1(){
        System.out.println("--> test1 Before 执行了");
    }
    @BeforeClass
    public static void test11(){
        System.out.println("--> test11 BeforeClass 执行了");
    }
    @After
    public void test2(){
        System.out.println("--> test2 After 执行了");
    }
    @AfterClass
    public static void test22(){
        System.out.println("--> test22 AfterClass 执行了");
    }
}
