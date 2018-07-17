package com.amrutha.enumeration;

 enum Enums {
    a, b, c,d;

    private Enums() {
        System.out.println(1);
    }
}
public class TestEnums {
     public static void main(String [] args){
         Enum en = Enums.a;
     }

}
