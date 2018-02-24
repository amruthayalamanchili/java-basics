package com.amrutha.static1;

public class MatrixTranspose extends TwoDMatrix {


    public MatrixTranspose(int startNum) {
        super(startNum);
    }
    public int [][] matTranspose(){
        TwoDMatrix td = new TwoDMatrix(1);
        int [][]matI= td.matInputs();
        for(int row =0;row<2;row++){
            for(int column =row++;column<2;column++) {
                int temp= matI[row][column];
                matI[row][column] = matI[column][row];
                matI[column][row]=temp;
            }
        }
         return matI;
        }
    }