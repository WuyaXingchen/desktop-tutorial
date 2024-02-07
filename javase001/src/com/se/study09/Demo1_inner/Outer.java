package com.se.study09.Demo1_inner;

public class Outer {
    private int age = 20;
    public static String a = "xx";

    // 静态内部类
    public static class Inner2 {
        //静态内部类访问外部类的静态变量，是可以的；
        //静态内部类访问外部类的实例变量，是不行的
        public void test() {
            System.out.println(a); //xx
            //System.out.println(age);   //报错
        }
    }

    public void test() {
        //局部内部类
        class Inner {
            public void show() {
                System.out.println("Inner...show");
            }
        }

        //局部内部类只能在方法中创建对象，并使用
        Inner in = new Inner();
        in.show();
    }

    // 内部类
    public class Inner1 {
        private String name = "乌鸦";
        private int age = 30;

        //在内部类中既可以访问自己类的成员，也可以访问外部类的成员
        public void test() {
            System.out.println(age); //30
            System.out.println(a);   //xx

            int age = 77;
            System.out.println(age); //77
            System.out.println(this.age); //30
            System.out.println(Outer.this.age); //20
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
