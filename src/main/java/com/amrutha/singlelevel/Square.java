package com.amrutha.singlelevel;

public class Square extends TwoDShapes{
    private int sideA;
    public Square(String shapeName,String color,boolean isFilled,int sideA){
        super(shapeName,color,isFilled);
        this.sideA = sideA;
    }
    public int getSideA(){
        return this.sideA;
    }
    @Override
    public float area() {
        return sideA * sideA;
    }
    @Override
    public float perimeter() {
        return 4 * sideA;
    }
}
