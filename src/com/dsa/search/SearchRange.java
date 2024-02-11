package com.dsa.search;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {0,0,1,2,2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                int rightIdx = searchRight(nums,mid,end,target);
                System.out.println("RightIdx:" + rightIdx);

                int leftIdx = searchLeft(nums,mid,start,target);
                System.out.println("LeftIdx:" + leftIdx);

                result[0] = leftIdx;
                result[1] = rightIdx;

                return result;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return result;
    }

    private static int searchRight(int[] nums, int mid, int end, int target) {
        int innerIdx = mid;
        while(innerIdx <= end) {
            if(nums[innerIdx] != target){
                return innerIdx - 1;
            } else {
                innerIdx = innerIdx + 1;
            }
        }
        return innerIdx - 1;
    }

    private static int searchLeft(int[] nums, int mid, int start, int target) {

        int innerIdx = mid - 1;

        while(innerIdx >= start) {
            if(nums[innerIdx] != target){
                return innerIdx + 1;
            } else {
                innerIdx = innerIdx - 1;
            }
        }
        return innerIdx + 1;
    }

}
