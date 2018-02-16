package com.amrutha.static1;

public class TestTwoDMatrix{
    public static void main(String [] args){
        TwoDMatrix tm = new TwoDMatrix(1);
        int [][] myMatrix = tm.matInputs();
        for(int row = 0;row<2;row++){
            for(int column =0;column<2;column++){
                System.out.print(myMatrix[row][column]+ " " );
            }
            System.out.println(" ");
        }

    }
}
