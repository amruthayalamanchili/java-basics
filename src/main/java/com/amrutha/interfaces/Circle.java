package com.amrutha.interfaces;

public class Circle implements TwoDShapes {
    private String ShapeName;
    private float pi = 3.141f;
    private int radius;
    public Circle(String shapeName,int radius){
        this.ShapeName = shapeName;
        this.radius = radius;
    }
    public String getShapeName(){
        return ShapeName;
    }

    public float area(){
        return 3.141f * this.radius * this.radius;
    }

    public float perimeter(){
        return 2 * pi * this.radius;
    }

}
