package com.amrutha.constructoroverloading;

public class TestStudent {
    public static void main(String [] args){
        Student s1 = new Student("amrutha",34);
        Student s2 = new Student("sirisha");
        Student s3 = new Student();
        System.out.println("Name:" + s1.getName() + " " + s1.getRollNo());
        System.out.println("name:" + s2.getName() + " " + "rollno:" + s2.getRollNo());
        System.out.println("Name:" + s3.getName());
    }
}
