package com.se.study09.Demo2_enum;

public enum A {
    X, Y, Z("张三");

    private String name;

    A() {
    }

    A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
