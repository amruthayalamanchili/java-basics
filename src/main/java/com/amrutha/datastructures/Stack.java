package com.amrutha.datastructures;

public class Stack {
    private int [] stackArray ;
    private int head = 0;

    public Stack(int stackSize ){
        this.stackArray = new int[stackSize];

    }

    public void push(int i){
        if(head < stackArray.length){
            stackArray[head] = i;
            head++;
        }else{
            throw new StackOverflowException();
            //System.out.println("out of range");
        }

    }

    public int pop(){
        if(head > 0){
            head--;
            int temp = stackArray[head];
            return temp;
        }else{
           throw new EmptyStackException();
        }

    }
}
