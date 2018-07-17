package com.amrutha.innerClasses;

public class NonStaticClassesOuter1 {
        //Member Inner Class : Class As a Non-Static Member
        class InnerClass
        {
            int i;    //can contain non-static field

            //static int j = 10;    //It gives compile time error

            //Should not contain static field

            void methodOne()
            {
                //can have non-static method
            }

            //static void methodTwo()
            //{
                //Compile time error
                //should not contain static method
            //}
        }
    }

