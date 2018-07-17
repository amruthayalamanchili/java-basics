package com.amrutha.mathoperations;

public class TestBasicCalculator {
    public static void main(String [] args){
        BasicCalculator bc = new BasicCalculator();
        System.out.println("Operations available:");
        System.out.println("1.sum");
        System.out.println("2.difference");
        System.out.println("3.product");
        System.out.println("4.division");
        System.out.println("result = " + bc.operation());
    }
}
