package com.dsa.topinterview150.slidingwindow;

public class MinSubArray {
    public static void main(String[] args) {
        //int[] nums = {10,2,3};
        //int[] nums = {1,1,1};
        //int target = 11;
        int[] nums = {1,2,3,4,5};
        int target = 11;
        System.out.println(minSubArrayLen(target, nums));
    }

    static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int min_steps = Integer.MAX_VALUE;

        //loop around nums
        while(r < nums.length || l<nums.length){
            if(min_steps == 1)
                return min_steps;

            if(sum >= target){
                min_steps = Math.min(min_steps, r - l);
                sum-=nums[l];
                l++;
            }

            if(sum < target && r<nums.length){
                sum+=nums[r];
                r++;
            }

            if(r>= nums.length && sum < target)
                break;

        }
        System.out.println("sum:" + sum);
        return min_steps == Integer.MAX_VALUE?0:min_steps;
    }
}
