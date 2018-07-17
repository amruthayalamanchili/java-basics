package com.amrutha.practiceMayFirstWeek;

import java.util.Comparator;

public class WtiEmployeeComparator implements Comparator<WhimsicalToysLottery> {
    @Override
    public int compare(WhimsicalToysLottery o1, WhimsicalToysLottery o2) {
        if (o1.equals(o2)) {
            return 0;
        } else {
            int i = o1.getFirstname().compareTo(o2.getFirstname());
            if (i == 0) {
                return o1.getLastname().compareTo(o2.getLastname());
            }else{
                return i;
            }
        }

    }
}
