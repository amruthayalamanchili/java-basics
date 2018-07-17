package com.amrutha.overloading;

public class TestClassB {
    public static void main(String [] args){
        ClassA c1 = new ClassB(3,4);
        int addititon = c1.addition();
        int addition1 = ((ClassB)c1).addition(3.5f,5.7f);
        System.out.println(addititon);
        System.out.println(addition1);

    }
}
