package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,2,4,6,1,3};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            insert(nums,i);
  ;      }

    }

    private static void insert(int[] nums, int idx){
        for (int i = idx; i > 0 ; i--) {
            if(nums[i] < nums[i -1]){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
            } else {
                break;
            }
        }
    }

}
