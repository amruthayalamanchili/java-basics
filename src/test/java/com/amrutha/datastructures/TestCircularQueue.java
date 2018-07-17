package com.amrutha.datastructures;

public class TestCircularQueue {
    public static void main(String [] args){
        CircularQueue cq = new CircularQueue(3);
        cq.insert(12);
        cq.insert(13);
        cq.insert(23);
        System.out.println(cq.delete() + " " + cq.delete());
        cq.insert(10);
        cq.insert(4);
        System.out.println(cq.delete()+ " " + cq.delete());
    }
}
