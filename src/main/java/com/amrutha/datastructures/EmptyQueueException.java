package com.amrutha.datastructures;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(){
        super("No more elements ,Queue is empty");
    }

}
