package com.se.study09.Demo5_object;

//想要调用clone()方法，必须让被克隆的类实现Cloneable接口
public class User implements Cloneable {
    private String name;
    private String password;
    private double[] scores;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅克隆
        //return super.clone();
        //深克隆
        User u=(User)super.clone();
        u.scores=u.scores.clone();
        return u;
    }

    public User() {
    }

    public User(String name, String password, double[] scores) {
        this.name = name;
        this.password = password;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }
}
