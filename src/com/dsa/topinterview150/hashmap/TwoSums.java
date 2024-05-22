package com.dsa.topinterview150.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = new int[] {3,3};
        int target = 6;
        int[] answer = twoSum(nums,target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> bank = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int second = target - nums[i];
            if(bank.containsKey(second)){
                return new int[]{bank.get(second), i};
            } else {
                bank.put(nums[i], i);
            }
        }

//        for (int i = 0; i < nums.length; i++) {
//            int second = target - nums[i];
//            System.out.println(second);
//            if(bank.containsKey(second) && second != nums[i]){
//                return new int[]{i,bank.get(second)};
//            }
//        }

        return new int[2];

    }
}
