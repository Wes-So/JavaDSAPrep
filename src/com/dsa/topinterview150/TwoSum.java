package com.dsa.topinterview150;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {5,25,75};
        int target = 100;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        //int i = 0;
        int j =1;

        for (int i = 0; i < numbers.length; i++) {
            j = i + 1;
            while(j < numbers.length) {
                if(numbers[i] + numbers[j] == target) {
                    return new int[] {i+1, j+1};
                } else {
                    j++;
                }
            }

        }
        return new int[] {};
    }
}
