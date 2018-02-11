package com.amrutha.public1;

public class PublicExtendsBaseClass1 extends PublicBaseClass1{
    public void publicExtendBaseMethod1(){
        //because of inheritence
        this.publicBaseMethod1();
        //TO prove public methods can be accessed by creating an object
        // and access directly.
        PublicBaseClass1 pb1 = new PublicBaseClass1();
        pb1.publicBaseMethod1();
    }
}
