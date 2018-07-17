package com.amrutha.leetcodeProblems;

import java.util.Arrays;

public class TwoSum {
    private int [] nums ;
    private int size;

    public TwoSum(int size) {
        this.nums = new int[size];
    }
        public int[]twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int result = nums[i] + nums[j];
                    if (target == result) {
                        System.out.println("num["+i+"]"+", num[" +j + "]");
                        return new int[]{i,j};
                    }
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }
