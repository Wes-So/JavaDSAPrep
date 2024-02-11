package com.dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(nums,33, 0,nums.length -1));
    }

    private static int search(int[] nums, int target, int start, int end) {
        //what is my base condition
        int mid = start + (end - start)/2;
        if(nums[mid] > target) {
            end = mid - 1;
        } else if (nums[mid]< target) {
            start = mid + 1;
        } else if (nums[mid] == target) {
            return mid;
        }

        if(start > end)
            return -1;

        return search(nums, target,start, end);
    }
}
