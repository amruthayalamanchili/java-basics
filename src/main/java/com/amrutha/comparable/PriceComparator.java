package com.amrutha.comparable;

import java.util.Comparator;

public class PriceComparator implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else if(o1.getPrice() > o2.getPrice()){
            return 1;
        }else{
            return -1;
        }
    }

}
