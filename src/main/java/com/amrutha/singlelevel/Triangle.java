package com.amrutha.singlelevel;

public class Triangle extends Parallelogram {
    private int sideC;
    public Triangle(String shapeName,String color,boolean isFilled,int base,int height,int sideA,int sideC){
        super(shapeName,color,isFilled,sideA,base,height);
        this.sideC = sideC;
    }

    public int getSideC(){
        return this.sideC;
    }

    @Override
    public float area(){
        return 0.5f * super.getBase() * super.getHeight();
    }

    @Override
    public float perimeter(){
        return super.getSideA() + super.getBase() + getSideC();
    }
}
