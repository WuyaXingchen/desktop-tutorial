package com.se.study20.Demo1_test;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testPrintNumber(){
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println(index1);

        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println(index2);

        //断言机制：预测index2的结果
        Assert.assertEquals("方法内部有Bug",4,index2);
    }
}
