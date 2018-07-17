package com.amrutha.mathoperations;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class SquareRoot {
    public static void main(String[] args) throws IOException {

        //float userInput1 = 0;
        // private int noOfGuessesToTry;
        //private float userGuess;
        float result = 0;

        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value to find the squareroot:");
        float userInput1 = Float.parseFloat((input1.readLine()));

        System.out.println("Enter the number of guesses:");
        int noOfGuessesToTry = Integer.parseInt(input2.readLine());

        System.out.println("Enter your guess:");
        float userGuess = Float.parseFloat((input3.readLine()));

        System.out.println("squareroot of : " + userInput1 + "; no. of guess: " + noOfGuessesToTry + "; userGuess: " + userGuess);

        float[] resultArray = new float[noOfGuessesToTry];

        for (int i = 0; i < noOfGuessesToTry; i++) {

            System.out.println("Loop : " + i);
            float step1 = (userInput1 / userGuess);
            //System.out.println("Step1: " + step1);

            float step2 = step1 + userGuess;
            //System.out.println("Step2: " + step2);

            float step3 = step2 / 2;

            //System.out.println("Step3: " + step3);
            userGuess = step3;
            resultArray[i] = step3;
            System.out.println("array is a[" + i + "] :  " + resultArray[i]);
        }
        double sqrt1 = 0;

        sqrt1 = Math.sqrt(userInput1);
        System.out.println("sqrt:" + sqrt1);
        int i =0;
        for (i = 0; i < noOfGuessesToTry; i++) {
            result = resultArray[i] * resultArray[i];
            System.out.println("result =" + result);
            //System.out.println("kamesh");
        }
        if(userInput1 == Math.round(result * 10000000)/10000000) {
             System.out.println("result of manual sqrt: " + result + "user input" + userInput1);
        }else{
             System.out.println("no nearest value");
        }

    }
}
