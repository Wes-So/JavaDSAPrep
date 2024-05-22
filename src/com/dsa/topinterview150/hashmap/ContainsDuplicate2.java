package com.dsa.topinterview150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        /*
            1. Put all the numbers in a map..
            2. If a duplicate is found, check if it's less than k
            3. If not, continue until end of array.
            4. If yes, return true.
         */
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i])) < k){
                return true;
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}
