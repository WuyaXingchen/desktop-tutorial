package com.se.study12.Demo1_excpetion;

//自定义异常
public class Test2 {
    public static void main(String[] args) {
        try {
            saveAge(225);
            System.out.println("saveAge2底层执行是成功的！");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("saveAge2底层执行是出现bug的！");
        }
    }

    public static void saveAge(int age) throws AgeIllegalException {
        if (age > 0 && age < 150)
            System.out.println("输入合法");
        else
            throw new AgeIllegalException("/年龄输入非法，你的年龄是：" + age);
    }
}
