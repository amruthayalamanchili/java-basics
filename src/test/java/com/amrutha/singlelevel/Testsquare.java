package com.amrutha.singlelevel;

public class Testsquare {
    public static void main(String [] args){
        Square s = new Square("Square","blue",false,3 );
        int sArea = (int)s.area();
        int sPerimeter = (int)s.perimeter();
        System.out.println("Name:" + s.getshapeName());
        System.out.println ("color:" + s.getColor()) ;
        System.out.println ("Filled:" + s.isFilled());
        System.out.println ("Area:" + sArea);
        System.out.println("Perimeter:" + sPerimeter);
    }
}
