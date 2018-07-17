package com.amrutha.comparable;

import java.util.*;

public class TestComparable {
    public static void main(String [] args){
        Fruit fruit1 = new Fruit("Banana", 3.00f);
        Fruit fruit2 = new Fruit("Guava",2.00f);
        Fruit fruit3 = new Fruit("Apple",7.00f);
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        Collections.sort(fruits, new PriceComparator());
        for(Fruit aFruit : fruits){
            System.out.println(aFruit.toString());
        }

    }
}
