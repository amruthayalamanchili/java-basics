package com.amrutha.comparision;

public class TestObjectComparision {
    public static void main(String [] args){
        int c = 10;
        int d = 10;
        ObjectComparision obj1 = new ObjectComparision(1,"a");
        ObjectComparision obj2 = new ObjectComparision(1,"a");
       System.out.println("\n" +obj1);
        System.out.println(obj1.equals(obj2));
        System.out.println(c==d);
    }
}
