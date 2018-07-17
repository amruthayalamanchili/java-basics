package com.amrutha.scanningFormatting;

public class FormattingXample {
    public static void main(String [] args){
        int i = 2;
        double r = Math.sqrt(i);
        System.out.print("the square root of ");
        System.out.print(i);
        System.out.print(" is ");
        System.out.println(r);
         i = 4;
        r = Math.sqrt(i);
        System.out.println("the squareroot of " + i + " is " + r) ;

    }
}
