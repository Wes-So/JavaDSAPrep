package com.dsa.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate2(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }

    private static boolean containsDuplicate2(int[] nums) {
        Map<Integer,Integer> unique = new HashMap<>();
        for(Integer num : nums){
            if(unique.containsKey(num)) {
                return true;
            } else {
                unique.put(num,1);
            }
        }
        return false;

    }

    private static void bubbleSort(int[] nums) {
        for(int i = 0; i<nums.length; i++) {
            for(int j = 1; j<nums.length - i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }

    private static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i  + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {

                    break;
                }
            }
        }
    }
}