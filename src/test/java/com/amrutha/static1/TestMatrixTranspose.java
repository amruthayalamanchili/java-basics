package com.amrutha.static1;

public class TestMatrixTranspose {
    public static void main(String [] args){
    MatrixTranspose mt = new MatrixTranspose(1);
    TwoDMatrix td = new TwoDMatrix(1);
    int [][] Matrix =td.matInputs();
    int [][] MatrixTranspose = mt.matTranspose();
    System.out.println("MY Matrix:");
    for(int row =0;row<2;row++){
        for(int column =0;column<2;column++){
            System.out.print(Matrix[row][column] + " ");

            }
            System.out.println(" ");
        }
        System.out.println("Matrix Transpose:");
    for(int row =0;row<2;row++){
        for(int column =0;column<2;column++){
            System.out.print(MatrixTranspose[row][column] + " ");

        }
        System.out.println(" ");
    }

    }
}
