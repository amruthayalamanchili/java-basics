package com.amrutha.checkingPublic;

import com.amrutha.publicmodifier.PublicBaseClass1;

public class CheckingPublicClass1 extends PublicBaseClass1{
    public void checkingPublicBaseMehtod1(){
        this.publicBaseMethod1();
        //we can access public methods and classes
        // in the same package as well as different packages
    }
}
