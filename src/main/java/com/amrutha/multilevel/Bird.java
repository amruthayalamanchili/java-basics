package com.amrutha.multilevel;

public abstract class Bird extends Animal {
    private boolean canFly;
    /*public Bird(){
        super();
        System.out.println("Default Bird Constructor");
    }*/
    public Bird(String name, char gender, String color, boolean canFly){
       super(name, gender, color);
       this.canFly=canFly;
    }
    public boolean isCanFly(){
        return this.canFly;
    }
}
