package com.amrutha.collections;

import java.util.ArrayList;
import java.util.List;
public class TestAddressBook {
    public static void main(String [] args){
        AddressBook addressArray [] = new AddressBook[4];
        AddressBook address = new AddressBook("sally",1234,"archgate ct","Alpharetta");
        AddressBook address1 = new AddressBook("cici",2345,"jersey village","houston");
        AddressBook address2 = new AddressBook("siri",123,"sgdfhgd","new jersey");
        AddressBook address3 = new AddressBook("kutty",3278,"bluestone","newyork");
        AddressBook address4 = new AddressBook("sally",1234,"archgate ct","Alpharetta");
        //System.out.println(address.getName() + "\n" + address.getStreetNumber() + "\n" + address.getStreetName() + "\n" + address.getCity());
        addressArray[0] = address;
        addressArray[1] = address1;
        addressArray[2] = address2;
        addressArray[3] = address1;
        /*for(int i = 0;i<addressArray.length;i++){
            System.out.println(addressArray[i]);
        }*/
        List<AddressBook> addressBooks = new ArrayList<>();
        //**addressBooks.ensureCapacity(3);
        addressBooks.add(address);
        addressBooks.add(address1);
        addressBooks.add(address2);
        addressBooks.add(address3);
        addressBooks.add(address1);
        addressBooks.add(address4);
        addressBooks.add(1,address3);


        System.out.println("list array");
        for(AddressBook aAddressBook:addressBooks){
            System.out.println(aAddressBook);
        }
        System.out.println("element present:" +addressBooks.contains(address));
        System.out.println(" Index Presence: " + addressBooks.get(1));
        System.out.println("Duplicate values presence:" + addressBooks.equals(address1));
        System.out.println("Index of given value:" + addressBooks.indexOf(address2));
        System.out.println("Last Index:" + addressBooks.lastIndexOf(address));
        Object[] ob = addressBooks.toArray();
        for(Object newList : ob){
            System.out.println("New array list:" + newList);
        }
        System.out.println("subList:" + addressBooks.subList(3,5));
        //**System.out.println("cloned list:"  + addressBooks.clone());
        //System.out.println("removed list:\n" +addressBooks.remove(1));
        System.out.println("Size:\n" + addressBooks.size());

    }
}
