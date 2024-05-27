package com.dsa.dailychallenge;

import java.util.Arrays;

public class SpecialNumbers{
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        /*
            1. Sort the array
            2. Set x as nums.length
            3. Check if how many numbers are greater or equal than x

         */
        int count = 0;
        int base = nums.length;

        Arrays.sort(nums);
        for (int i = nums.length -1; i > -1 ; i--) {
            while(nums[i] < base){
                if(count == base) return base;
                base--;
            }

            if(nums[i] >= base) count++;
        }

        System.out.println("Count:=" + count);
        System.out.println("Base:=" + base);
        return count == base?base:-1;

    }
}
