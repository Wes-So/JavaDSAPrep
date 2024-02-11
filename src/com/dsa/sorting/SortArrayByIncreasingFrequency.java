package com.dsa.sorting;

import java.util.HashMap;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        frequencySort(nums);
        System.out.println(nums);

    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i] + 1));
            } else {
                freq.put(nums[i], freq.get(nums[i] + 1));
            }
        }

        return nums;
    }
}
