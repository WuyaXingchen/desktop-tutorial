package com.se.study09.Demo4_generics;

public class MyArrayList<E> {
    private Object[] array = new Object[10];
    private int index;

    public void add(E e) {
        array[index] = e;
        index++;
    }

    public E get(int index) {
        return (E) array[index];
    }
}
