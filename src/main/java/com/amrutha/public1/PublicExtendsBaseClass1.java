package com.amrutha.public1;

public class PublicExtendsBaseClass1 extends PublicBaseClass1{
    public void publicExtendBaseMethod1(){
        this.publicBaseMethod1();
        PublicBaseClass1 pb1 = new PublicBaseClass1();
    }
}
