package com.se.study09.Demo4_generics;

import java.util.ArrayList;

public interface Data<T> {
    public void add(T t);

    public ArrayList<T> getByName(String name);
}
