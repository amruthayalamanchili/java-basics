package com.amrutha.overloading;

public class TestClassC {
    public static void main(String [] args){
        InterfaceA in = new ClassC(3,4);
        int sub = in.subtract();
        int sub1 = ((ClassC)in).subtract(3.5f,7.5f);
        System.out.println(sub);
        System.out.println(sub1);
    }
}
