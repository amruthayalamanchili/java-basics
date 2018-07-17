package com.amrutha.comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if (o1.equals(02)) {
            return 0;
        } else {
            String s1 = o1.getName().toLowerCase();
            String s2 = o2.getName().toLowerCase();
            int c1 = s1.charAt(0);
            int c2 = s2.charAt(0);
            if(c1 > c2){
                return 1;
            }else{
                return -1;
            }
        }
    }
}
