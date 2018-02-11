package com.amrutha.protected1;

public class ProtectExtendBaseClass1 extends ProtectBaseClass1{
    protected void protectExtendBaseMethod1(){
        this.protectBaseClassMethod1();
    }
}
//we can access methods with protected identifier
// in the same package using inheritance only