package com.amrutha.singlelevel;

public final class Trapezoid extends TwoDShapes{
    private int baseA;
    private int baseB;
    private int sideC;
    private int sideD;
    private int height;
    public Trapezoid(String shapeName,String color,boolean isFilled,int baseA,int baseB,int sideC,int sideD,int height){
        super(shapeName,color,isFilled);
        this.baseA = baseA;
        this.baseB = baseB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    public int getBaseA(){
        return this.baseA;
    }
    public int getBaseB(){
        return this.baseB;
    }
    public int getSideC(){
        return this.sideC;
    }
    public int getSideD(){
        return this.sideD;
    }

    @Override
    public float area(){
        return (getBaseA() + getBaseB()) * height * 0.5f;
    }

    @Override
    public float perimeter(){
        return getBaseA() + getBaseB() + getSideC() + getSideD();
    }
}
