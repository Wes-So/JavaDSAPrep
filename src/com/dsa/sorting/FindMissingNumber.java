package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }


    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums,i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        List<Integer> missing = new ArrayList<>();
        for(int j = 0; j< nums.length; j++) {
            if(nums[j] != j + 1) {
                missing.add(j + 1);
            }
        }

        return missing;
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;

    }
}