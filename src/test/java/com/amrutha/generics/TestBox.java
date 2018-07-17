package com.amrutha.generics;

public class TestBox {
    public static void main(String [] args){
        Box<Integer,String> box = new Box<>();
        Box rawBox = box;
        rawBox.set(20,"appleBox");
        System.out.println(rawBox.getWeight() + " " + rawBox.getNameOfTheBox());
        box.set(10,"orangesBox");
        System.out.println(box.getWeight() + " " +box.getNameOfTheBox());

    }
}
