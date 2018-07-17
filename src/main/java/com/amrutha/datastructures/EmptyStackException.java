package com.amrutha.datastructures;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        super("No more elements in stack");
    }

}
