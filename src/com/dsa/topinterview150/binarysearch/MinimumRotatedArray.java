package com.dsa.topinterview150.binarysearch;

public class MinimumRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while(start < end) {
            int mid = start + (end - start)/2;
            System.out.println("mid:" + mid);
            if(nums[mid] < nums[end]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return nums[start];
    }
}
