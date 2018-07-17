package com.amrutha.leetCodeProblems;

import com.amrutha.leetcodeProblems.Palindrome;
import java.util.*;

public class TestPalindrome {
    public static void main(String [] args){
       // Palindrome palindromeNumber = new Palindrome(4);
        //int pNumber = 0;
        int [] number = new int[3];
        int [] reverseNumber = new int [number.length];
        for(int i = 0;i<number.length;i++){
            System.out.println("Enter the number[" + i + "]: " );
            Scanner input = new Scanner(System.in);
            number [i] = input.nextInt();
        }
        System.out.println(Arrays.toString(number));

       // for(int i = 0;i<number.length;i++){
         //   System.out.print("orginal array"+number[i]);
        //}
        System.out.println("\nIs it a palindrome ?");
        for(int i =0;i<number.length;i++){
            //reverseNumber[i] =number[i];
            reverseNumber[i] = number[number.length-1-i];
           //number[i+number.length-1]=temp;
        }
        System.out.println(Arrays.toString(reverseNumber));
        //System.out.println("Reversed Number:");

        if (Arrays.equals(number,reverseNumber)) {
            System.out.print("Plandrome Array");
        }else{
            System.out.print("Not plandrome array");

        }


    }
}
