package com.dsa.topinterview150.arrays;

import java.util.Arrays;

public class MergedSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int n = 3;
        int[] nums2 = {2,5,6};
        int m = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {2,0};
        int[] nums4 = {1};
        int m1 = 1;
        int n1 = 1;
        merge(nums3, m1, nums4, n1);
        System.out.println(Arrays.toString(nums3));
    }

    private static void merge(int[] nums1 , int m, int[] nums2, int n) {

        if(n == 0) return;
        int idx = nums1.length - 1;

        while(m > 0 && n > 0){
            if(nums1[m-1] >= nums2[n-1]){
                nums1[idx] = nums1[m-1];
                m--;
            } else {
                nums1[idx] = nums2[n-1];
                n--;
            }
            idx--;
        }
        
        while(n > 0){
            nums1[idx] = nums2[n-1];
            n--;
            idx--;
        }
    }



}
