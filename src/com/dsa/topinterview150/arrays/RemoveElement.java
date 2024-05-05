package com.dsa.topinterview150.arrays;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static int removeElement2(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[k++] = nums[i];
        }
        return k;
    }
}
