package com.amrutha.comparable;

import java.util.HashSet;
import java.util.Set;

public class TestSetFruits {
    public static void main(String [] args){
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Apple");
        fruitSet.add("Pear");
        fruitSet.add("Berries");
        for(String aSet:fruitSet){
            System.out.println(aSet);
        }
    }
}
