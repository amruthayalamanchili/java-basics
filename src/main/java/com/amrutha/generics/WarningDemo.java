package com.amrutha.generics;

public class WarningDemo {
    public static void main(String[] args){
        Box<Integer,String> bi;
        bi = createBox();
    }

    static Box createBox(){
        return new Box();
    }
}
