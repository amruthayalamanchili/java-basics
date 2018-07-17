package com.amrutha.datastructures;

public class QueueOverflowException extends RuntimeException{
    public QueueOverflowException(){
        super("adding more elements than given size");
    }
}
