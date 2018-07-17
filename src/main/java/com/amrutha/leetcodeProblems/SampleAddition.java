package com.amrutha.leetcodeProblems;

import java.util.List;
import java.util.LinkedList;

public class SampleAddition {
    public static void main(String [] args){
        int [] myArray = new int[3];
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println("list1:");
        list1.add(1);
        list1.add(2);
        list1.add(3);
        for(Integer aNumber:list1){
            System.out.print(aNumber + "\n");
        }
        System.out.println("list2:");
        list2.add(2);
        list2.add(4);
        list2.add(3);
        for(Integer aNumber:list2){
             System.out.print(aNumber +"\n");
        }
        System.out.println("Added number:");
        for (int j = 0; j < list1.size(); j++) {
            int i = list1.get(j) + list2.get(j);
            // i = i+1;
            System.out.println(i);
            myArray[j]=i;
        }
        for(int j = 0;j<list1.size();j++){
            System.out.println("ARRAY VALUES: " + myArray[j]);
        }
        for(int i=0;i<myArray.length/2;i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        for(int i=0;i<myArray.length;i++){

            System.out.println("reversed value:" + myArray[i]);

        }
    }
}
