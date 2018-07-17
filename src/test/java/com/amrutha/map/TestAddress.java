package com.amrutha.map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestAddress {
    public static void main(String [] args){
        Map<Address,Set<Person>> mappersonAddress= new HashMap<>();
        Set<Person > personSet1 = new HashSet<>();
        Set<Person> personSet2 = new HashSet<>();
        Person person1 = new Person("shetty","saja","1232343sggwd");
        Person person2 = new Person("puppy","yesha","23454767vsaghdfg");
        Address address1 = new Address("3666 webbridge rd",30014);
        Address address2 = new Address("2343 highway 9",300065);
        personSet1.add(person1);
        personSet2.add(person2);
        mappersonAddress.put(address1,  personSet1);
        mappersonAddress.put(address2,personSet2);
        for(Map.Entry<Address, Set<Person>> entry: mappersonAddress.entrySet()){
            //System.out.println(entry.getKey());
            for(Person person: entry.getValue()){
                System.out.println(mappersonAddress.entrySet());
            }
        }

       //System.out.println(mappersonAddress.entrySet());

    }
}
