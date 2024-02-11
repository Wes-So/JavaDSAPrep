package com.dsa.topinterview150;

import java.util.Arrays;

public class MergedSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int x = 0;
        int[] mix = new int[m + n];

        while(i < m && j < n) {
            if(nums1[i] < nums2[j]){
                mix[x] = nums1[i];
                i++;
            } else {
                mix[x] = nums2[j];
                j++;
            }
            x++;
        }

        while(i < m) {
            mix[x] = nums1[i];
            x++;
        }

        while(j < n) {
            mix[x] = nums2[j];
            x++;
        }

        for (int k = 0; k < mix.length ; k++) {
            nums1[k] = mix[k];
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        while(m < nums1.length) {
            nums1[m] = nums2[i];
            m++;
            i++;
        }
        System.out.println(Arrays.toString(nums1));
        bubbleSort(nums1);
    }

    private static void bubbleSort(int[] nums) {
        boolean isSwapped = false;
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }

            }

            if(!isSwapped)
                break;

        }
    }
}
