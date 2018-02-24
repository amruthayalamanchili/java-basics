package com.amrutha.singlelevel;

public class TestRectangle {
    public static void main(String [] args){
        Rectangle r;
        r = new Rectangle("rectangle","black",true,5,8);
        int rArea = (int)r.area();
        int rPerimeter = (int)r.perimeter();
        System.out.println("name:" + r.getshapeName());
        System.out.println("Color:" + r.getColor());
        System.out.println("Filled:" + r.isFilled());
        System.out.println("Area:" + rArea);
        System.out.println("Perimeter:" + rPerimeter);
    }
}
