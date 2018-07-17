package com.amrutha.valuesAndReferences;

import java.util.*;

public class PassByReference {

    public static void mutableObjectMethod1(List<Integer> list1){
        System.out.println("method list:");
        for(Integer alist:list1){
            System.out.println( alist.toString());
        }
        list1.add(1,25);

    }

    public static void mutableObjectMethod2(Set<Integer> set1){
        System.out.println("method set:");
        for(Integer aset:set1){
            System.out.println(aset.toString());
        }
        set1.add(34);
        set1.add(56);
    }

    public static void mutableObjectMethod3(Map<Integer,Integer> map1){
        System.out.println("method map:");
        for(Map.Entry<Integer, Integer> amap:map1.entrySet()){
            System.out.println("method map:" + amap);
        }
        map1.put(1,23456);
    }

    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        PassByReference.mutableObjectMethod1(list);
        System.out.println("main method list:" + list);

        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(24);
        set.add(32);
        set.add(34);
        PassByReference.mutableObjectMethod2(set);
        System.out.println("main method set:" + set);
        Map<Integer,Integer> map = new HashMap<>();
        map.put(2,3456);
        map.put(1,245678);
        PassByReference.mutableObjectMethod3(map);
        System.out.println("main method map:" + map);
    }
}