package com.dsa.topinterview150;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int val = 2;
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,val));
        System.out.println(Arrays.toString(nums));

    }

    public static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                if(idx != i) {
                    nums[idx] = nums[i];
                    nums[i] = 0;
                }


                idx++;
            } else {
                nums[i] = 0;
            }
        }
        return idx;
    }
}
