package com.amrutha.innerClasses1;

import com.amrutha.innerClasses.BasicOuterClass;

public class TestBasicOuterClass1 {
    public static void main(String [] args){
        BasicOuterClass.BasicStaticClass staticObject = new BasicOuterClass.BasicStaticClass(23);
        System.out.println(staticObject.getZ());

    }

}
