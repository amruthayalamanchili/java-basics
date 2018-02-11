package com.amrutha.private1;

public class PrivateExtendBase1 extends PrivateBase1 {
    private void privateExtendBaseMethod1(){
       // this.privateBaseMethod1();
        //We cannot access methods with
        // private identifier even in the same package using inheritance
    }
}
