package com.amrutha.enumeration;

public class TestEnumerationClass {
    public static void main(String [] args){
        EnumerationClass day1 = new EnumerationClass(EnumerationClass.Day.Sunday);
        EnumerationClass day2 = new EnumerationClass(EnumerationClass.Day.Monday);
        EnumerationClass day4 = new EnumerationClass(EnumerationClass.Day.Wednesday);
        EnumerationClass day5 = new EnumerationClass(EnumerationClass.Day.Thursday);
        day1.goodBadDays();
        day2.goodBadDays();
        day4.goodBadDays();
        day5.goodBadDays();
    }
}
