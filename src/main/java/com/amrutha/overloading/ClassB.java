package com.amrutha.overloading;

public final class ClassB extends ClassA{
    private int a;
    private int b;
    public ClassB(int a,int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int addition(){
        return a + b;
    }
    public int addition(float a,float b){
        return (int)(a + b);
    }

}
