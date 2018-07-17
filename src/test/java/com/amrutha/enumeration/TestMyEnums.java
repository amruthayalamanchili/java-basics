package com.amrutha.enumeration;

enum MyEnums{
    First,Second,Third,Fourth;
}
public class TestMyEnums {
    public static void main(String [] args){
        MyEnums [] enumArray = new MyEnums[5];
        for(int i = 0;i<enumArray.length;i++){
            System.out.println(enumArray[i]);
        }
    }
}
