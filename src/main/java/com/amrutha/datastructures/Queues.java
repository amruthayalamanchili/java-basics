package com.amrutha.datastructures;

public class Queues {
    private int [] queueArray;
    private int head = 0;
    private int tail = 0;

    public Queues(int queueSize){
        this.queueArray = new int[queueSize];
    }

    public void add(int i){
       if(tail < queueArray.length){
           queueArray[tail] = i;
           tail++;
       }else{
           throw new QueueOverflowException();
       }

    }

    public int remove() throws ArrayIndexOutOfBoundsException{
        if(head<=tail){
            int result = queueArray[head];
            head++;
            return result;
        }else{
            throw new EmptyQueueException();
        }

    }

}
