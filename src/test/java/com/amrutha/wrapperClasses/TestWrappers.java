package com.amrutha.wrapperClasses;

public class TestWrappers {
    public static void main(String [] args){
        Integer integer = new Integer(1);
        Integer integer1 = new Integer(4);
        String s = "1";
        int a = integer; //Assigning wrapper class object to primitives
        System.out.println(Integer.reverse(integer));
        System.out.println(integer.compareTo(integer1));
        System.out.println(integer);
        System.out.println(a);
    }
}
