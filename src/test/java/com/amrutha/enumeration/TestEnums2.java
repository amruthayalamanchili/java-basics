package com.amrutha.enumeration;

enum Levels{
    Top,Medium(10),Bottom(20,30);
    int i,j;
    Levels(){

    }
    Levels(int i){
        this.i = i;
    }
    Levels(int i,int j){
        this.i = i;
        this.j = j;
    }

}
public class TestEnums2 {
    public static void main(String [] args){
        System.out.println(Levels.Top);
        System.out.println(Levels.Bottom.i);
        System.out.println(Levels.Bottom.j + "," + Levels.Bottom.i);
        System.out.println(Levels.Medium.i);
        System.out.println(Levels.Medium.j);

    }
}
