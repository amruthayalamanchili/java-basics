package com.amrutha.static1;

public class Circle {
    public static final float pi = 3.14f;
    private final int radius;
    static{
        System.out.println("pi ="+ pi);
    }
    public static void welcome(){
        System.out.println("Welcome to java Programming");
    }
    public static void helloTo(){
        Circle.helloTo();
    }
    public Circle(int radius){
        this.radius = radius;
        System.out.println("radius =" + this.radius);
    }
    public float area(){
        Circle.welcome();
        System.out.println("pi value"+Circle.pi);
        return Circle.pi * this.radius * this.radius;
    }
    public float perimeter(){
        return 2 *Circle.pi * this.radius;
    }
  }
