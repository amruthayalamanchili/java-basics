package com.amrutha.lambdaExpressions;

public class Lambda {
    interface Person {
        public void getName();
    }

    class Persons {
        int age;

        public Persons(int age) {
            this.age = age;
        }

    }

    public void personDetails(Persons p, Person q) {
        q.getName();

    }
}
