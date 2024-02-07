package com.se.study11.Demo3_method_reference;

public class CompareByData {
    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
    public int compareByAge2(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}
