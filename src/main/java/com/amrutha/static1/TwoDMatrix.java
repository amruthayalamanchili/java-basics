package com.amrutha.static1;

public class TwoDMatrix {
        private int startNum;
        public TwoDMatrix(int startNum){
            this.startNum = startNum;
        }
        public int [][] matInputs(){
            int [][] mat=new int[2][2];
            for(int row=0;row<2;row++){
                //startNum++;
                for(int column=0;column<2;column++){
                    mat[row][column]=startNum;
                    startNum++;
                }
            }
            return mat;
        }
}
