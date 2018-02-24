package com.amrutha.singlelevel;

public class TestTrapezoid {
    public static void main(String [] args){
        Trapezoid t;
        t = new Trapezoid("Trapezoid","red",true,4,8,5,5,6);
        float tArea = t.area();
        float tPerimeter = t.perimeter();
        System.out.println("Name:" + t.getshapeName());
        System.out.println("Color:" + t.getColor());
        System.out.println("Filled:" + t.isFilled());
        System.out.println("Area:" + tArea);
        System.out.println("Perimeter:" + tPerimeter);
    }
}
