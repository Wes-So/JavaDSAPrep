package com.dsa.topinterview150.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        int[] nums2 = {};
        System.out.println(summaryRanges(nums2));
    }

    static List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        int start = Integer.MIN_VALUE;
        int current = Integer.MIN_VALUE;
        String out = "";

        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                start = nums[i];
                current = nums[i];
            } else if(nums[i] - current == 1){
                current = nums[i];
            } else {
                if(start != current) {
                    out = start + "->" + current;
                } else {
                    out = Integer.toString(current);
                }
                output.add(out);
                start = nums[i];
                current = nums[i];
            }
        }

        //handle dangling numbers
        if(start == Integer.MIN_VALUE)
            return output;

        if(start == current) {
            output.add(Integer.toString(current));
        } else {
            output.add(start + "->" + current);
        }
        return output;
    }
}
