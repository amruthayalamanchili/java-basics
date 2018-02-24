package com.amrutha.multilevel;

public final class Parrot extends Bird {
    /* public Parrot(){
         super();
         System.out.println("I m a Bird:Parrot");
     }*/
    public Parrot(String name, char gender, String color, boolean canFly) {
        super(name, gender, color, canFly);
    }

    @Override
    public void createSound() {
        System.out.println("cuckoooo");
       // super.createSound();
    }
}


