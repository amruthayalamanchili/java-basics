package com.amrutha.problempractice;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public Calculator() throws IOException {
    }

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int input1 = Integer.parseInt(input.readLine());
    BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));
    int input2 = Integer.parseInt(inputs.readLine());

    public int sum() {
        int sum = 0;
        sum = input1 + input2;
        /*try {
            BufferedReader operation = new BufferedReader(new InputStreamReader((System.in)));
            String oper = operation.readLine();

        } catch (IOException e) {
            System.out.println("wrong input");
        }*/
        return sum;
    }
    /*public
    if(c.oper.equals("sum")){
        System.out.println("sum = " + c.sum());
    }else{
        System.out.println("no operation");
    }*/

    public int operation() throws IOException {
        System.out.println("enter the operation to perform:");
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
        String op = input1.readLine();
        int opValue = 0;
        switch(op){
            case "sum":
                System.out.println("in switch sum case");
                opValue = sum();
            break;
            default:
                System.out.println("no operation");
            break;
        }
        return opValue;
    }
}

