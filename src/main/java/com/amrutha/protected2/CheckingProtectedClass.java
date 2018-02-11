package com.amrutha.protected2;

import com.amrutha.protected1.ProtectBaseClass1;

public class CheckingProtectedClass extends ProtectBaseClass1{
    protected void checkingProtectedMethod(){
        this.protectBaseClassMethod1();
       // pc1.StandAloneMethod();
        // we cannot access objects of base class in other packages
        //we can access methods with protected
        // identifier even though they are in other packages using inheritance.
    }
}
