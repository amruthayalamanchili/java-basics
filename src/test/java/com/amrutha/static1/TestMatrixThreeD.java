package com.amrutha.static1;

public class TestMatrixThreeD {
    public static void main(String [] args){
        MatrixThreeD mt = new MatrixThreeD(3);
        //int num=mt.getStartNum();
        int [][] getMatrix = mt.setMatrix();
        for(int row=0;row<3;row++){
            for(int column=0;column<3;column++){
                System.out.print(getMatrix[row][column]+ "  ");
            }
            System.out.println(" ");
        }
    }
}
