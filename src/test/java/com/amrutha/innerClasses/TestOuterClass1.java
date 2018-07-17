package com.amrutha.innerClasses;

public class TestOuterClass1 {
    public static void main(String [] args){
        OuterClass1.methodOne(); //static member can be accessed directly through class name.
        OuterClass1 o1 = new OuterClass1();
        System.out.println(o1.i); //Instance Members can be accessed only thru objects.
        OuterClass1.NestedClassOne.methodOne();
        OuterClass1.NestedClassOne n1 = new OuterClass1.NestedClassOne();
        System.out.println(n1.i);
        OuterClass1.NestedClassTwo n2 = new OuterClass1.NestedClassTwo();
        n2.methodTwo();

    }
}
