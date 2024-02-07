package com.se.study05.Demo2_this;

public class Student {
    double score;

    public void printThis() {
        System.out.println(this);
    }

    public void printJudge(double score) {
        if (this.score > score)
            System.out.println("成绩有进步~~");
        else if (this.score < score)
            System.out.println("成绩退步了！！");
        else
            System.out.println("成绩和之前一样");
    }
}
