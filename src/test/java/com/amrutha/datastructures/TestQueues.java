package com.amrutha.datastructures;

public class TestQueues {
    public static void main(String [] args) throws ArrayIndexOutOfBoundsException{
        Queues q = new Queues(3);
        for(int i = 0;i<3;i++){
            q.add(1);
            q.add(6);
            q.add(7);
            System.out.println(q.remove() + " " +q.remove() + " " + q.remove());
            System.out.println("end of queue");
        }
        //q.add(3);
        //q.add(5);
        //System.out.println(q.remove() + " " + q.remove());



    }
}
