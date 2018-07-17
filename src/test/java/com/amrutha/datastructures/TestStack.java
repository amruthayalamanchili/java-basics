package com.amrutha.datastructures;

public class TestStack {
    public static void main(String [] args){
        Stack s = new Stack(10);
        for(int i=0;i<10;i++){
            s.push(1);
            s.push(2);
            s.push(3);
            //s.push(4);
            System.out.println("result:" + s.pop() +"\n" + s.pop()+"\n" + s.pop());
            System.out.println("end of iteration");
        }
         s.push(1);
         s.push(2);
         s.push(3);
         //s.push(4);
         System.out.println("result:" + s.pop() +"\n" + s.pop()+"\n" + s.pop());
    }
}
