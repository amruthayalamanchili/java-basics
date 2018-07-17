package com.amrutha;

import java.util.Scanner;

public class SampleTestClass {
    public static void main(String [] args){
        int i;
        boolean opinion;

        Scanner s = new Scanner(System.in);
        do
        {
            System.out.println("enter value:");
            i = Integer.parseInt(s.nextLine());
            System.out.println("value entered:" + i);
            System.out.println("Enter your opinion:");
            opinion =Boolean.parseBoolean( s.nextLine());
        } while (opinion );





    }
}
