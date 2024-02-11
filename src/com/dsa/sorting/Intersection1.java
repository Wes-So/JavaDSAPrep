package com.dsa.sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Intersetion1 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
     }
    public static int[] intersection(int[] nums1, int[] nums2) {
         // 1) sort both arrays
        bubbleSort(nums1);
        bubbleSort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

         // 2) Get smallest array and check against bigger array
        //3) Put same
        Set<Integer> intersect = new HashSet<Integer>();
        int[] base;
        if(nums1.length > nums2.length) {
            base = new int[nums2.length];
        } else {
            base = new int[nums1.length];
        }

        for(int i = 0; i < base.length; i++) {

        }


        return null;
    }

    private static void bubbleSort(int[] nums) {
        for(int i = 0; i<nums.length;i++){
            //System.out.println(Arrays.toString(nums));
            for(int j = 0; j <nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}