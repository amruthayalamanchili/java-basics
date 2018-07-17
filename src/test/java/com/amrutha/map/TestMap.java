package com.amrutha.map;
import java.util.HashMap;
import java.util.Map;
public class TestMap {
    public static void main(String [] args){
        Map <String ,String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        map.put("q1","answer1");
        map.put("q2","answer2");
        map.put("q1","answer3");
        map.put("q3","answer3");

        System.out.println("key presence:" + map.containsKey("q3"));
        System.out.println("value: " + map.containsValue("answer1"));
       // System.out.println("removing value:" + map.remove("q3"));
        System.out.println("size of the map:" + map.size());
        System.out.println("key q1:" + map.get("q1"));
        System.out.println("key q2:" + map.get("q2"));
        System.out.println(" key q3:" +map.get("q3"));
        System.out.println("map is Empty:" + map.isEmpty());
        System.out.println("values:" + map.values());
        System.out.println("set of values:" + map.entrySet());
        System.out.println("set of keys:"  + map.keySet());
        //map.clear();
        System.out.println("size after clearance:" + map.size());
    }

}
