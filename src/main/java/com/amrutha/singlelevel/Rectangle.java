package com.amrutha.singlelevel;

import com.amrutha.singlelevel.TwoDShapes;

public  final class Rectangle extends TwoDShapes {
    private int width;
    private int length;

    public Rectangle(String shapeName,String color,boolean isFilled,int width,int length){
        super(shapeName,color,isFilled);
        this.width = width;
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    @Override
    public float area(){
        return width * length;
    }
    @Override
    public float perimeter() {
        return 2 * (width + length);
    }
}
