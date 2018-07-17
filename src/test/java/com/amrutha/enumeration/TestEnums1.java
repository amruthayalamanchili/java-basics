package com.amrutha.enumeration;

enum Enum1{
    A,B,C;
    {
        System.out.println(1);
    }
    static{
        System.out.println(2);
    }
    private Enum1(){
        System.out.println(3);
    }
}
public class TestEnums1 {
    public static void main(String [] args){
        Enum1 en = Enum1.A;
    }

}
