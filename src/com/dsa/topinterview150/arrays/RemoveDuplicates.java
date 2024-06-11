package com.dsa.topinterview150.arrays;


import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates2(nums));
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

    public static int removeDuplicates2(int[] nums) {
        int k = 0;
        int val = Integer.MIN_VALUE;
        int ctr = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val || ctr < 2) {
                if(nums[i]!= val){
                    ctr = 1;
                } else {
                    ctr++;
                }
                val = nums[i];
                nums[k] = nums[i];
                k++;
            } else {
                ctr++;
            }
        }
        return k;
    }
}
