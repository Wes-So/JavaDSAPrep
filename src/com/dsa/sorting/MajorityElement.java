package com.dsa.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num : nums) {
            if (numsMap.containsKey(num)) {
                numsMap.replace(num, numsMap.get(num) + 1);
            } else {
                numsMap.put(num, 1);
            }
        }

        int topKey = 0;
        int topValue = 0;

        for (Map.Entry<Integer, Integer> set : numsMap.entrySet()) {
            if(set.getValue() > topValue) {
                topValue = set.getValue();
                topKey = set.getKey();
            }
        }

        return topKey;
    }
}