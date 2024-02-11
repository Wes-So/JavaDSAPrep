package com.dsa.topinterview150.math;

import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
      int x = 121;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
        int original = x;
        List<Integer> nums = new ArrayList<>();

        while(x > 0){
            int temp = x%10;
            nums.add(temp);
            x=x/10;
        }
        System.out.println(nums);

        int i = 1;
        int size = nums.size();
        int reverse = 0;

        for(int num:nums){

            reverse = reverse * 10 + num;
            System.out.println(reverse);
            i++;
        }
        System.out.println(reverse);
        return reverse == original;
    }
}
