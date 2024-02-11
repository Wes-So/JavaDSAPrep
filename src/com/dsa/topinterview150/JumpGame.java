package com.dsa.topinterview150;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {5,9,3,2,1,0,2,3,3,1,0,0};
        System.out.println(canJump(nums));
    }

    static boolean canJump(int[] nums) {
        int sum = 0;
        int max_idx = 0;
        for (int i = 0; i < nums.length; i++) {

            if(max_idx < i)
                return false;

            if(nums[i] > 0) {
                sum = i + nums[i];
                max_idx = Math.max(sum, max_idx);
            }

            if(sum >= nums.length)
                return true;
        }
        return true;
    }
}
