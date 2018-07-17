package com.amrutha.leetCodeProblems;

import com.amrutha.leetcodeProblems.SampleBinarySearch;

public class TestBinarySearch {
    public static void main(String [] args){
            SampleBinarySearch binarySearch = new SampleBinarySearch();
            int guessvalue = binarySearch.doSearch(new int[]{99,100},88);
            //System.out.println(targetValue);
            System.out.println("guessValue is at array[" + guessvalue+"]" );
        }
    }

