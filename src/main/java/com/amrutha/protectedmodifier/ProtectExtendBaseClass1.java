package com.amrutha.protectedmodifier;

public class ProtectExtendBaseClass1 extends ProtectBaseClass1{
    protected void protectExtendBaseMethod1(){
        this.protectBaseClassMethod1();
    }
}
//we can access methods and classes with protected identifier
// in the same package using inheritance only