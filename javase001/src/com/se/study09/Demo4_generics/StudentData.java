package com.se.study09.Demo4_generics;

import java.util.ArrayList;

public class StudentData implements Data<Student> {
    @Override
    public void add(Student student) {

    }

    @Override
    public ArrayList<Student> getByName(String name) {
        return null;
    }
}
