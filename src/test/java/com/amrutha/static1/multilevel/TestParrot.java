package com.amrutha.static1.multilevel;

import com.amrutha.multilevel.Animal;
import com.amrutha.multilevel.Parrot;

public class TestParrot {
    public static void main(String [] args){
       // Animal a = new Animal("sahd",'f',"red") ;
        Parrot p = null;
        p = new Parrot("honey", 'f', "red", true);
        System.out.println("Name:" + p.getName());
        System.out.println("Gender:" + p.getGender());
        System.out.println("Color:" + p.getColor());
        System.out.println("CanFly:" + p.isCanFly());
        p.createSound();
    }
}
