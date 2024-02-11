package com.dsa.topinterview150;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int removeDuplicates(int[] nums) {
        int limit = 0;
        int idx = 0;
        int base = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=base){
                base=nums[i];
                nums[idx]=base;
                idx++;
                limit=1;
            } else {
                if(limit<2){
                    nums[idx]=base;
                    limit++;
                    idx++;
                }
            }

        }

        return idx;
    }
}
