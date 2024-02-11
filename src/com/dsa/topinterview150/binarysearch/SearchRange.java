package com.dsa.topinterview150.binarysearch;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        //int[] nums = {1,3};
        int target = 1;
        int[] output = searchRange(nums,target);
        System.out.println(Arrays.toString(output));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int[] output = {-1,-1};
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                int prev = mid;
                for (int i = mid; i > 0; i--) {
                    if(i-1 > -1 && nums[i-1] == target){
                        prev--;
                    }
                }

                int next = mid;
                for (int i = next; i < nums.length ; i++) {
                    if(i+1 < nums.length && nums[i+1] == target){
                        next++;
                    }
                }

                output[0] = prev;
                output[1] = next;
                return output;

            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                start  = mid + 1;
            }
        }

        return output;
    }
}
