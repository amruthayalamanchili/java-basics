package com.amrutha.default2;

import com.amrutha.default1.BaseClass1;

public class CheckingDefaultClass extends BaseClass1 {
    public int checkingDefaultMethod(){
        //if a method has default access scope,
        // even with inheritance we cannot access that method because
        // of the method is under different package
        //this.baseClassMethod();
        return 0;
    }
}
