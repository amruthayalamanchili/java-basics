package com.amrutha.enumeration;

public class EnumerationClass {
    public enum Day{
        Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }
    Day myDay;
    public EnumerationClass(Day myDay){
        this.myDay = myDay;
    }

    public void goodBadDays(){
        switch (myDay){
            case Sunday:
                System.out.println("Happy Day");
                break;
            case Monday:
                System.out.println("working day");
                break;
            case Tuesday:
                System.out.println("Hmmm working day");
                break;
            case Wednesday:
                System.out.println("hmmm workinggg");
                break;
            case Thursday:
                System.out.println("working");
                break;
            case Friday:
                System.out.println("near to weekend");
                break;
            case Saturday:
                System.out.println("hee weekend");
                break;
        }
    }

}
