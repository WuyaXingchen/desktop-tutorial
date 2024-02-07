package com.se.study08.Demo4_abstract_test;

public abstract class Animal {
    private String name;

    public abstract void barking();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
