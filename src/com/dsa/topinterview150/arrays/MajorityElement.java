package com.dsa.topinterview150.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> store = new HashMap<>();
        for(int num : nums) {
            store.put(num, store.getOrDefault(num, 0) + 1);
        }

        int max = nums.length/2;
        for(Map.Entry<Integer, Integer> entry: store.entrySet()) {
            if(entry.getValue() > max) {
                ans = entry.getKey();
            }
        }

        return ans;
    }
}
