package com.amrutha.comparable;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<PersonNames> {
    @Override
    public int compare(PersonNames o1, PersonNames o2) {
       if(o1.equals(o2)){
           return 0;
       }else {
          int i1= o1.getFirstName().compareTo(o2.getFirstName());
          if(i1 ==0){
              return o1.getLastName().compareTo(o2.getLastName());
          }else{
              return i1;
          }
       }
    }
}
