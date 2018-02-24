package com.amrutha.singlelevel;

public class TestTriangle {
    public static void main(String [] args){
        Triangle t = new Triangle("Triangle","yellow",false,4,6,7,8);
        int tArea = (int)t.area();
        int tPerimeter = (int)t.perimeter();
        System.out.println("Name:" + t.getshapeName());
        System.out.println("color:" + t.getColor());
        System.out.println("Filled" + t.isFilled());
        System.out.println("Area:" + tArea);
        System.out.println("Perimeter:" + tPerimeter);

    }
}
