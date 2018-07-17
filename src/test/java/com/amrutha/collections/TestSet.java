package com.amrutha.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String [] args){
        Set<AddressBook> aSet = new HashSet<>();
        AddressBook address = new AddressBook("sally",1234,"archgate ct","Alpharetta");
        AddressBook address1 = new AddressBook("cici",2345,"jersey village","houston");
        AddressBook address2 = new AddressBook("siri",123,"sgdfhgd","new jersey");
        AddressBook address3 = new AddressBook("kutty",3278,"bluestone","newyork");
        AddressBook address4 = new AddressBook("sally",1234,"archgate ct","Alpharetta");
        aSet.add(address);
        aSet.add(address1);
        aSet.add(address2);
        aSet.add(address3);
        aSet.add(address4);
        for(AddressBook aAddress : aSet){
            System.out.println(aAddress);
        }
        System.out.println("Set is Empty:" +aSet.isEmpty());
        System.out.println("Size:" + aSet.size());
        System.out.println("element added:" + aSet.add(address));
        System.out.println("Contains given elment:" + aSet.contains(address4));
        Object ob = aSet.iterator();
        for(Object aIterator: aSet){
            System.out.println("Iterator elements:" + aIterator);
        }

    }
}
