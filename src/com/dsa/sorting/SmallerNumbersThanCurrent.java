package com.dsa.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        int[] nums = {6,5,4,8};

        //bubbleSortReverse(nums);
        //System.out.println(Arrays.toString(nums));
        //smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        bubbleSortReverse(sorted);
        Map<Integer,Integer> counterMap = new HashMap<>();

        for(int i = 0; i< sorted.length; i++){
            int ctr = 0;
            for(int j = i + 1; j <sorted.length;j++){
                if(sorted[i] > sorted[j])
                    ctr++;
            }
            counterMap.put(sorted[i], ctr);
            System.out.println("i:ctr=" + sorted[i] +":" + ctr);
        }

        int[] diff = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            diff[i] = counterMap.get(nums[i]);
        }

        return diff;
    }

    private static void bubbleSortReverse(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - i -1; j++) {
                if(nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}