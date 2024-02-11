package com.dsa.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Search {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersection(nums1, nums2);

        System.out.println(Arrays.toString(result));

    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        return null;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        int[] base = nums1;
        int[] select = nums2;

        if(nums1.length >= nums2.length) {
            base = nums2;
            select = nums1;
        }

        if(nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }


        for(int i = 0; i < base.length; i++){
            int j = 0;
            System.out.println("base:" + base[i]);
            while(j < select.length) {
                if(base[i] == select[j]){
                    System.out.println("select:" + select[j]);
                    result.add(base[j]);
                    break;
                }
                j++;
            }
        }

        int[] intResult = new int[result.size()];
        int idx =0;
        for(int item:result){
            intResult[idx] = item;
            idx++;
        }

        return intResult;
    }

}

