package com.dsa.topinterview150.arrays;


import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int val = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                val = nums[i];
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
