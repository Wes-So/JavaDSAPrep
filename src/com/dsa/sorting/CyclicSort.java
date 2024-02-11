package com.dsa.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        //sort(arr);

        int[] nums = {9,6,4,2,3,5,7,0,1};
        //int[] nums = {1,2};
        //missingNumber(nums);
        System.out.println(missingNumber(nums));
    }

    static void sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr,i, correct);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;

    }


    static  int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
           // System.out.println("i:" + i);

            int correct = nums[i];
            //System.out.println("correct:" + correct);
            if(correct < nums.length && nums[correct] != nums[i]){
                swap(nums, i, correct);
              //  System.out.println(Arrays.toString(nums));
                continue;
            }

            i++;


        }

        System.out.println(Arrays.toString(nums));

        for(int j = 0; j< nums.length; j++){
            if(nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }
}
