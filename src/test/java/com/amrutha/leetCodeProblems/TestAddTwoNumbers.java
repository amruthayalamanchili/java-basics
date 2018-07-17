package com.amrutha.leetCodeProblems;

import com.amrutha.leetcodeProblems.AddTwoNumbers;

import java.util.LinkedList;
import java.util.List;

public class TestAddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers numbers = new AddTwoNumbers();
        LinkedList<Integer> number1 = new LinkedList<>();
        LinkedList<Integer> number2 = new LinkedList<>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        System.out.println(number1);
        System.out.println(number2);
       // numbers.addTwoNumbers(number1,number2);

    }
}
