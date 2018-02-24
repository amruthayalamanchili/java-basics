package com.amrutha.singlelevel;

public class TestCircle {
    public static void main(String [] args){
        Circle c = new Circle("Circle","blue",false,4);
        float cArea = c.area();
        float cPerimeter = c.perimeter();
        System.out.println("name:" + c.getshapeName());
        System.out.println("color:" + c.getColor());
        System.out.println("Area:" + cArea);
        System.out.println("Perimeter:" + cPerimeter );
    }
}
