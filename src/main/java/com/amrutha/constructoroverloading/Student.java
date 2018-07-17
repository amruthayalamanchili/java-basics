package com.amrutha.constructoroverloading;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name){
        this.name = name;
    }

    public Student(String name,int rollNo){
        this("amrutha");
        this.rollNo = rollNo;
    }

    public Student() {
        this("amrutha");
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
