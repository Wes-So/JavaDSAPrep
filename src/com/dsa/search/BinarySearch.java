package com.dsa.search;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearch {
    public static void main(String[] args) {
        //int[] nums = {0,2,3,4,5,6,7};
        int[] nums = {1,3};
        int answer = search(nums,1);
        System.out.println(answer);
//        int[] nums = {5};
//        System.out.println("response:" + search(nums,5));
//        assertEquals(search(nums,4),3);
        char[] letters = {'c', 'f','j'};
        //char[] letters = {'x', 'x','y','y'};

        //System.out.println(nextGreatestLetter(letters, 'j'));
    }

    public static int searchInsert(int[] nums, int target) {
        //first scenario: target is found
        //2nd scenario: target is not found find highest base
        int start = 0;
        int end = nums.length - 1;
        int possible = 0;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            System.out.println(start + ":" + mid + ":" + end);
            if (target > nums[mid]) {
                start = mid + 1;

            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                //scenario 1
                return mid;
            }
        }

        //scenario 2
        return start;
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            System.out.println("start|mid|end=" + start + ":" + mid + ":" + end);
            System.out.println(letters[mid]);
            if( target < letters[mid] ) {
                System.out.println("Greater than");
                end = mid - 1;
                System.out.println("end:" + end);
            }else if(target >= letters[mid]) {
                start = mid + 1;
            }
        }

        if(start >= letters.length)
            return letters[0];

        return letters[start];
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while(start <= end){
            int mid = start + (end - start)/2;
            System.out.println("mid:=" + mid);

            if(target > nums[mid]) {
                start = mid + 1;
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;
    }
}
