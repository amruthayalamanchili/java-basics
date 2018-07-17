package com.amrutha.comparision;

public class TestPatient {
    public static void main(String [] args){

        Patient p1 = new Patient("sri",23);
        Patient p2 = new Patient("sai",13);

        if(p1.compareTo(p2) == -1){
            System.out.println( p1.toString()+" is slimmer than " + p2.toString());
        }else if(p1.compareTo(p2) == 1){
            System.out.println(p1.toString()+ " is heavier than " + p2.toString());
        }else{
            System.out.println(p1.toString()+" same as" + p2.toString());
        }

    }
}
