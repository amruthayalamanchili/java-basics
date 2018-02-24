package com.amrutha.singlelevel;

public class TestParallelogram {
    public static void main(String [] args){
        Parallelogram p;
        p = new Parallelogram("paralellogram","red",true,6,8,8);
        int pArea = (int)p.area();
        int pPerimeter = (int)p.perimeter();
        System.out.println("Name:"+p.getshapeName());
        System.out.println("color:" + p.getColor());
        System.out.println("filled:" + p.isFilled());
        System.out.println("Area:" + pArea);
        System.out.println("Perimeter:" + pPerimeter);
    }
}
