package com.amrutha.multilevel;

public abstract class Animal {
    private String name;
    private char gender;
    private String color;
   /*public Animal(){
       super();
        System.out.println("Default Animal Constructor");
    }*/
    public Animal(String name, char gender, String color){
       this.name = name;
       this.gender = gender;
       this.color = color;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }
    public String getColor(){
        return this.color;
    }
    public abstract void createSound();/*{
        System.out.println("Animal has no sound");
    }*/


}
