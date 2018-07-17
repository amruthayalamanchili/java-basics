package com.amrutha.enumeration;
enum ABC
{
    ABC;

    int i = 1;

    {
        i++;
        System.out.println(i);
    }

    {
        ++i;
        System.out.println(i);
    }

    private ABC()
    {
        int a = i++;
        System.out.println("a "+a);
        int b = ++i;
        System.out.println("b "+b);
        i = a + b;
        System.out.println(i);
    }
}
public class TestIncrement {
    public static void main(String [] args){
        System.out.println(ABC.ABC.i);
    }
}
