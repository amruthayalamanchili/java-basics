package com.amrutha.static1;
public class TestEvenOdd {
    public static void main(String [] args){
        EvenOdd eo = new EvenOdd(13);
        float res = eo.result();
        if(res ==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
