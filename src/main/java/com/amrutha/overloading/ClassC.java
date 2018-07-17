package com.amrutha.overloading;

public  final class ClassC implements InterfaceA {
    private int a;
    private int b;
    public ClassC(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int subtract(){
        return a - b;
    }
    public int subtract(float a,float b){
        return (int)(a - b);
    }
}
