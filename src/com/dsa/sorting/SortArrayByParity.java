package com.dsa.sorting;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        sortArrayByParity(nums);
    }
    public static int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 ==0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
