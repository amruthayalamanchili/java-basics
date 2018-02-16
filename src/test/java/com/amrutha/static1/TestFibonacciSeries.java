package com.amrutha.static1;

public class TestFibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries fg1 = new FibonacciSeries(10, 0, 1);
        // Object creation for class
        int[] mySeries = fg1.mySeries();//Invoking the method
        for (int i = 2; i < mySeries.length; i++) {
            System.out.print(" "+ mySeries[i]);
        }
    }
}