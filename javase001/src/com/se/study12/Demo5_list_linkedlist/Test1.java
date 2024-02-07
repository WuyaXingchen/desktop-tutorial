package com.se.study12.Demo5_list_linkedlist;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("第1人");
        queue.addLast("第2人");
        queue.addLast("第3人");
        queue.addLast("第4人");
        System.out.println(queue);

        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());

        System.out.println(queue);
    }
}
