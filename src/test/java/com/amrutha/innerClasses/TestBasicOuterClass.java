package com.amrutha.innerClasses;

import com.amrutha.innerClasses.BasicOuterClass;

public class TestBasicOuterClass {
    public static void main(String [] args){
        BasicOuterClass outerObject = new BasicOuterClass(1,2);
        BasicOuterClass.BasicStaticClass innerObject = new BasicOuterClass.BasicStaticClass(20);
        System.out.println(outerObject.getX());
        System.out.println(outerObject.getY());
        System.out.println(innerObject.getZ());


    }
}
