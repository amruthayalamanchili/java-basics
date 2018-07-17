package com.amrutha.comparision;


public class Patient implements Comparable<Patient>  {
     private String name;
     private int weight;

    public Patient(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public int compareTo(Patient o) {
        if(this.weight < o.weight){
            return -1;
        }else if(this.weight > o.weight){
            return 1;
        }else{
            return 0;
        }

    }
}
