package com.amrutha.exceptionhandling;

public class Division {
    String s = "AMRUTHA";
    public Division(){
    }
    public float divideByZero(){
        return 1/0;
    }
    public String myMethod(){
        return s.toLowerCase();
    }
}
