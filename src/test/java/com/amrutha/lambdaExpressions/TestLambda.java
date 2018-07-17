package com.amrutha.lambdaExpressions;

public class TestLambda {
    public static void main(String [] args){
        Lambda l = new Lambda();
        Lambda.Persons p1 = l.new Persons(23);
        class PersonName implements Lambda.Person {

            @Override
            public void getName() {
                String name;
                name = "sanJose";
                System.out.println("hello" + name);
            }
        }
        //Lambda.Person myName = new PersonName();
       // myName.getName();
        l.personDetails(p1,new PersonName());
        Lambda.Person AnonymousPerson = new Lambda.Person() {
            @Override
            public void getName() {
                String name;
                name = "anonymous Person";
                System.out.println("hello" + name);
            }
        };
        l.personDetails(p1,AnonymousPerson);
        //l.personDetails(p1,()-> System.out.println("this is lambda"));

    }


}
