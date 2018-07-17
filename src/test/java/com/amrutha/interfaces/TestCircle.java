package com.amrutha.interfaces;

public class TestCircle {
    public static void main(String [] args){
        TwoDShapes c1 = new Circle("circle",3);
        float cArea = c1.area();
        float cPerimeter = c1.perimeter();
        System.out.println("Area:" + cArea);
        System.out.println("Perimeter" + cPerimeter);
        System.out.println("shapeName:" + ((Circle)c1).getShapeName());
        //we need to typecast the methods to access which are part of the child class and not in baseclass
    }

}
