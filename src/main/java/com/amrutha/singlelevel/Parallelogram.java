package com.amrutha.singlelevel;

public class Parallelogram extends Square {
    private int base;
    private int height;
    public Parallelogram(String shapeName, String color, boolean isFilled, int sideA,int height, int base) {
        super(shapeName, color, isFilled, sideA);
        this.base = base;
        this.height = height;
    }
    @Override
    public float area(){
        return base * height;
    }

    @Override
    public float perimeter(){
        return 2 * (super.getSideA() + base);
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
}
