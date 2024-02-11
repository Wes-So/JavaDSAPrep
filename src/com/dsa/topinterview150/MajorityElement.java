package com.dsa.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        int maxValue = Integer.MIN_VALUE;;
        int maxKey = Integer.MIN_VALUE;
        System.out.println("Second Loop");
        for(Integer key: countMap.keySet()) {
             if(countMap.get(key) > maxValue) {
                maxValue = countMap.get(key);
                maxKey = key;
            }
        }
        return maxKey;
    }
}
