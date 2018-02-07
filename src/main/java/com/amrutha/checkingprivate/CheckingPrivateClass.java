package com.amrutha.checkingprivate;

import com.amrutha.privatemodifier.PrivateBase1;

public class CheckingPrivateClass extends PrivateBase1{
    private void checkingPrivateMethod(){
       // this.privateBaseMethod1();
       //we cannot access methods with private identifier
        // even in same or different packages using inheritance.
        //Classes cannot be private.
    }
}
