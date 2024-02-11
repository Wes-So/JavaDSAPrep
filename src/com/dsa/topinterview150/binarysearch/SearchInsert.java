package com.dsa.topinterview150.binarysearch;

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid - 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid; //found the number
            }
        }



        return start;
    }
}
