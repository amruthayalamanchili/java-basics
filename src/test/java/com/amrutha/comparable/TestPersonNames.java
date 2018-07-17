package com.amrutha.comparable;

import com.amrutha.map.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestPersonNames {
    public static void main(String [] args){
        PersonNames p1 = new PersonNames("Dave","Strupps");
        PersonNames p2 = new PersonNames("John","Merchant");
        PersonNames p3 = new PersonNames("Robert","Trump");
        PersonNames p4 = new PersonNames("Robert","Quiggle");
        PersonNames p5 = new PersonNames("Richard","Jobs");

        List<PersonNames> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        Collections.sort(list,new FirstNameComparator());
         for(PersonNames aPerson : list){
             System.out.println(aPerson);
         }

    }
}
