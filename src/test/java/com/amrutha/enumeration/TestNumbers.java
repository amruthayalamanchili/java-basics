package com.amrutha.enumeration;

enum enumOne{
    ONE;{
        System.out.println("one");
    }
    enum enumTwo{
        TWO;{
            System.out.println("two");
        }
    }
}
public class TestNumbers {
    public static void main(String [] args){
        System.out.println(enumOne.enumTwo.TWO);
    }
}
