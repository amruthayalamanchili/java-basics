package com.amrutha.default2;

import com.amrutha.default1.BaseClass1;

public class CheckingDefaultClass1 {
    public void checkingDefaultMethod1(){
        BaseClass1 bc1 = new BaseClass1();
        //we cannot access default(access modifier) modified methods or classes
        // in any other packages except the same package
        //bc1.baseClassMethod();
    }
}
