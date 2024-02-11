package com.dsa.topinterview150;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2};
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }


    static void rotate(int[] nums, int k) {
        k%=nums.length;

        System.out.println(3%7);
        rotateContents(nums,0,nums.length -1);
        rotateContents(nums,0,k - 1);
        rotateContents(nums,k,nums.length -1);
    }

    static void rotateContents(int[] nums,int start, int end){

        while(start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;

        }
    }
}
