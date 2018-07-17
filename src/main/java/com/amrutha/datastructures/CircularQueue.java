package com.amrutha.datastructures;

public class CircularQueue {
    private int frontPointer;
    private int rearPointer;
    private int queueSize;
    private int [] cQueueArray;
    private int qMaxSize;

    public CircularQueue(int size){
        qMaxSize = size;
        frontPointer = -1;
        rearPointer = -1;
        queueSize = 0;
        cQueueArray = new int[qMaxSize];
    }

    public int delete(){
       // queueSize--;
        frontPointer = (frontPointer + 1)%qMaxSize;
        return cQueueArray[frontPointer];
    }

    public void insert(int value){
        //queueSize++;
        rearPointer = (rearPointer + 1)%qMaxSize;
        cQueueArray[rearPointer] = value;
    }
}

