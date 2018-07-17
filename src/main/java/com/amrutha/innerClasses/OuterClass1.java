package com.amrutha.innerClasses;

public class OuterClass1 {
    int i =10;
    static void methodOne(){
        System.out.println("outer class method");
    }
    static class NestedClassOne{
        int i = 23;
        static void methodOne(){
            System.out.println("Nested Class One method");
        }
    }

    static class NestedClassTwo{
        int i= 11;
        void methodTwo(){
            System.out.println("nested class Two Method");
        }
    }

}
