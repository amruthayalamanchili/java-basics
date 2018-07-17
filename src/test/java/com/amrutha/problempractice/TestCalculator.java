package com.amrutha.problempractice;

import java.io.IOException;

public class TestCalculator {
    public static void main(String [] args) throws IOException{
        Calculator c = new Calculator();
        System.out.println("value A =" + c.input1);
        System.out.println("value B =" + c.input2);
        System.out.println("sum = " + c.operation());


    }
}
