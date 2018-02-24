package com.amrutha.static1;

public class MatrixThreeD {
    private int startNum;
    public  MatrixThreeD(int startNum) {
        this.startNum=startNum;
    }
    public int [][] setMatrix(){
        int [][] matrixThreeD=new int[3][3];
        for(int row =0;row<3;row++){
            for(int column =0;column<3;column++){
                matrixThreeD[row][column]=startNum;
                startNum++;
            }
        }
        return matrixThreeD;
    }
}
