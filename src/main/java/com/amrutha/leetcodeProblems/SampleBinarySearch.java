package com.amrutha.leetcodeProblems;
import java.util.Arrays;
import java.lang.Integer;

public class SampleBinarySearch {

    private int guess;

    // Returns either the index of the location in the array,
    // or -1 if the array did not contain the targetValue
    public static int doSearch(int[] array,int targetValue) {
        int min = 0;
        System.out.println(Arrays.toString(array));
        int max = array.length - 1;
        int guess = 0;

        while (array[guess] != targetValue) {
            guess = Math.round((min + max) / 2);
            if (array[guess] < targetValue) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
            if (max < min) {
                return -1;
            }
        }
        return guess;
    }


}

