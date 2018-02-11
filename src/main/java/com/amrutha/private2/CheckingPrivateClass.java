package com.amrutha.private2;

import com.amrutha.private1.PrivateBase1;

public class CheckingPrivateClass extends PrivateBase1{
    private void checkingPrivateMethod(){
       // this.privateBaseMethod1();
       //we cannot access methods with private identifier
        // even in same or different packages using inheritance.
        //Classes cannot be private.
    }
}
