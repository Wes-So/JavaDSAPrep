package com.dsa.sorting;

import java.util.Arrays;

class SortByParity2 {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sort(nums)));
    }
    public static int[] sort(int[] nums) {

        int half = nums.length/2;
        int[] even = new int[half];
        int[] odd = new int[half];
        int evenIdx = 0;
        int oddIdx = 0;

        for(int i=0; i<nums.length; i++){
            //if i is even nums[i] should be even and vice versa
            if(nums[i] %2 == 0){
                even[evenIdx] = nums[i];
                evenIdx++;
            } else {
                odd[oddIdx] = nums[i];
                oddIdx++;
            }
        }
        int j = 0;
        for(int i = 0; i<nums.length; i=i+2){
            nums[i] = even[j];
            nums[i+1] = odd[j];
            j++;
        }

        return nums;
    }
}