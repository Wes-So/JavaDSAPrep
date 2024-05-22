package com.dsa.topinterview150.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges2 {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        System.out.println(summaryRanges(nums));

    }

    public static List<String> summaryRanges(int[] nums) {
        /*
            1. Loop 0 through nums[]
            2. start with num[i] then check num[i+1] if it's the next number
            3. If not then print start -> end
            4. else continue to the next number
         */
        List<String> ranges = new ArrayList<>();
        if(nums.length == 0) return ranges;

        int start = nums[0];
        int end = start;

        for (int i = 0; i < nums.length ; i++) {
            if(i + 1 == nums.length) {
                end = nums[i];
                ranges.add(buildRange(start,end));
                break;
            }

            if(nums[i+1] - nums[i] != 1){
                end = nums[i];
                ranges.add(buildRange(start,end));
                //System.out.println("Range:=" + start + "->" + end);
                start = nums[i + 1];
                //end = start;
            }
        }
        return ranges;
    }

    public static String buildRange(int start, int end){
        if(start != end){
            return start + "->" + end;
        } else {
            return Integer.toString(end);
        }
    }
}
