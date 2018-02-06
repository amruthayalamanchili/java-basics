package com.amrutha.checkingprotected;

import com.amrutha.protectedmodifier.ProtectBaseClass1;

public class CheckingProtectedClass extends ProtectBaseClass1{
    protected void checkingProtectedMethod(){
        this.protectBaseClassMethod1();
        //we can access methods with protected
        // identifier even though they are in other packages using inheritance.
    }
}
