package com.amrutha.mathoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalculator {
    private int a,b;
    private int result;
    private String op;
    public BasicCalculator(){

    }
    public int getA(){
        try {
            System.out.println("Enter the value of A:");
            BufferedReader in
                    = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(in.readLine());
        }catch(IOException e){
            System.out.println("Not a number" + e);
        }
        return a;
    }

    public int getB(){
        try{
            System.out.println("Enter the value of B:");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            b = Integer.parseInt(input.readLine());
        }catch(IOException e){
            System.out.println("not a number");
        }
        return b;
    }

    public int sum(){
        return result = getA() + getB();
    }

    public int difference(){
        return result = getA() - getB();
    }

    public int product(){
        return result = getA() * getB();
    }

    public int division(){
        return result = getA() / getB();
    }

    public int operation(){
        try{
            System.out.println("Enter the operation:");
            BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));
            op = inputs.readLine();
            System.out.println("User selected: " + op);
        }catch(IOException e){
            System.out.println("Invalid input");
        }
        if(op.equals("sum")) {
            return sum();
        }else if(op.equals("difference")){
            return difference();
        }else if(op.equals("product")){
            return product();
        }else if (op.equals("division")){
            return division();
        }else{
            System.out.println("no operation");
            return 0;
        }
    }
}
