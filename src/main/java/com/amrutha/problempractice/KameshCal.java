package com.amrutha.problempractice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KameshCal {
    public static void main(String [] args){
        String op1 = null;
        int result = 0;
        String [] op = {"add","multiply","diff","sqrt"};

        try {

            System.out.println("Enter the Operation you want to perform:");
            BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));
            op1 = inputs.readLine();
            System.out.println("user input is: " + op1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (op1.equals(op[0])){
            System.out.println("Doing the following operation: " + op1);
            try {
                result = sum();
                System.out.println("summ of va1ue 1 & value2 is :" + result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("You entered the wrong option");
        }
    }

    public static int sum() throws IOException {
        System.out.println("Please enter value 1 for addition: ");
        BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(inputs.readLine());

        System.out.println("Please enter value 2 for addition: ");
        BufferedReader inputs1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(inputs1.readLine());

        System.out.println("User entered value1 " + a + " & value2 " + b + " for addition."  );
        int c = a + b;

        return c;
    }

    public static int diff() throws IOException {
        System.out.println("Please enter value 1 for addition: ");
        BufferedReader inputs = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(inputs.readLine());

        System.out.println("Please enter value 2 for addition: ");
        BufferedReader inputs1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(inputs1.readLine());

        System.out.println("User entered value1 " + a + " & value2 " + b + " for addition."  );
        int c = a - b;

        return c;
    }


}
