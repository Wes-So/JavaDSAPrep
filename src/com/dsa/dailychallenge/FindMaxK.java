package com.dsa.dailychallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMaxK {
    public static void main(String[] args) {
        int[] nums = {-2,-3,-1,1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(findMaxK(nums));

    }

    public static int findMaxK(int[] nums) {
        /*
            1. sort the array. largest number is at the end
            2. start at the end for the biggest number
            3. compare if equals then return
            4. NEED TO SPEED THIS UP RETHINK LOGIC
         */
        Arrays.sort(nums);
        List<Integer> values = new ArrayList<>();
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            if(nums[i] < 0){
                values.add(nums[i]);
                i++;
            } else{
                j--;
            }

            if(values.contains(-nums[j])) return nums[j];

        }
        return -1;
    }
}
