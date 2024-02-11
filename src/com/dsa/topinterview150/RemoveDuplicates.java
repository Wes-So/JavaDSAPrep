package com.dsa.topinterview150;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2};
        int count = removeDuplicates(nums);
        System.out.println(count);
    }

    private static int removeDuplicates(int[] nums) {

        int base = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= base){
                base = nums[i];
                nums[idx] = base;
                idx++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return  idx;
    }
}
