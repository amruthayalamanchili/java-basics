package com.amrutha.static1;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle(4);
        Circle c2 = new Circle(6);
        //c1.pi = 2.14f;
        //Circle.pi = 4.14f;
        System.out.println("Area of circle c1= " +c1.area());
        System.out.println("area of circle c2 = " + c2.area());
        System.out.println("Perimeter of circle c1 =" + c1.perimeter());
        System.out.println("Perimeter of circle c2 =" + c2.perimeter());

    }

}
