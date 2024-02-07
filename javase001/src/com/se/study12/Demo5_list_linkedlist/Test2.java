package com.se.study12.Demo5_list_linkedlist;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        //压栈(push) 等价于 addFirst()
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);

        //弹栈(pop) 等价于 removeFirst()
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
