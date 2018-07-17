package com.amrutha.valuesAndReferences;

import java.security.Key;
import java.util.*;

public class PassByValue {

    public static void main(String [] args){
        int i = 10;
        PassByValue.method1(i);
        System.out.println("As primitive: "+i);

        Integer i1 = new Integer(3);
        PassByValue.IntegerMethod(i1);
        System.out.println("As primitive object: "+i1);
        String s = "abc";
        System.out.println("as primitive:"+ s);
        PassByValue.StringMethod(s);
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        PassByValue.method2(arr);
        for(int j=0;j<arr.length;j++){
            System.out.println("Array values:" + arr[j]);
        }
        Integer [] i2 = new Integer[2];
        i2[0] = 12;
        i2[1] = 10;
        PassByValue.WrapperMethod(i2);
        for(int j = 0;j<i2.length;j++){
            System.out.println("object value:" + i2[j]);
        }
        String string []= new String[2];
        string[0] = "123";
        string[1] = "456";
        PassByValue.arrayMethod(string);
        for(int j = 0;j<string.length;j++){
            System.out.println("String Array outside:" + string[j]);
        }

        /* String [] arr1 = new String[5];
        arr1[0] = "a";
        arr1[1] = "m";
        arr1[2] = "r";
        arr1[3] = "u";
        arr1[4] = "t";
        PassByValue.method3(arr1);*/
        List<String> list = new ArrayList(4);
        list.add("hi");
        list.add("hello");
        list.add("how r u");
        PassByValue.method4(list);
        System.out.println("list values:" +list);
        System.out.println("Set values:");
        Set<String> set = new HashSet<>();
        set.add("andy");
        set.add("hally");
        set.add("andy");
        set.add("hai");
        PassByValue.method5(set);
        System.out.println("main set:" + set);/*
        System.out.println("map values:");
        Map<String,Integer> myMap= new HashMap<>();
        myMap.put("hally",12);
        myMap.put("sally",13);
        PassByValue.method6(myMap);*/

    }
    public static void IntegerMethod(Integer i1){
        System.out.println(i1);
        i1 = 24;
    }

    public static void StringMethod(String s1){
        System.out.println("String Method value:" + s1);
        s1 = "def";
    }

    public static void method1(int i){
        System.out.println(i);
        i = 20;
    }
    public static void method2(int [] myArray){
        for(int j =0;j<myArray.length;j++){
            System.out.println("Method2 Array:" + myArray[j]);
        }
        myArray[1]=20;
    }

    public static void arrayMethod(String []stringArray){
        for(int j=0;j<stringArray.length;j++){
            System.out.println("string array inside:" + stringArray[j]);
        }
        stringArray[1]="789";
    }

    public static void WrapperMethod(Integer [] myArray){
        for(int j = 0;j<myArray.length;j++){
            System.out.println("WrapperMethod =" + myArray[j]);
        }
        myArray[1] = 30;
    }
    public static void method3(String[] myArray1){
        for(int j =0;j<5;j++){
            System.out.println(myArray1[j]);
        }
    }

    public static void method4(List<String> myList){
        for(String aValue:myList){
            System.out.println(" method list values:" + aValue.toString());
        }
        myList.add(2,"see you");

    }

    public static void method5(Set<String> set){
        for(String aSet : set){
            System.out.println(aSet.toString());
        }
        set.add("mary");
    }

    public static void method6(Map<String,Integer> myMap){
        for(Map.Entry<String, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }

}
