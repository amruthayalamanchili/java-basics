package com.amrutha.singlelevel;

import com.amrutha.singlelevel.TwoDShapes;

public final class Circle extends TwoDShapes {
    private final float pi=3.141f;
    private int radius;
    public Circle(String shapeName,String color,boolean isFilled,int radius){
        super(shapeName,color,isFilled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    @Override
    public float area() {
        return 0.5f * pi * this.radius * this.radius;
    }
    @Override
    public float perimeter() {
        return 2 * pi * this.radius;
    }
}