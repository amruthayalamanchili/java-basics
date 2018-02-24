package com.amrutha.static1;

public class MatrixInverse extends TwoDMatrix {
    private float determinant;
    public MatrixInverse(int startNum,float determinant){
        super(startNum);
        this.determinant = determinant;
    }

    @Override
    public int [][] matInputs(){
        int [][] matIn = new int[2][2];
        return super.matInputs();
    }

    /*public float [][] matInverse(){
        for(int row = 0;row < 2;row++){
            for(int coloumn = 0;coloumn < 2;coloumn++){
                determinant = (matIn([row][column]))
            }
        }

    }*/

}
