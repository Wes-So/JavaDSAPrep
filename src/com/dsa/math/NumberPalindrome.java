package com.dsa.math;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(232);
        //System.out.println(232%10);
        //System.out.println(232);

    }

    public static boolean isPalindrome(int x) {

        //get last digit
        //how do you get first digit
       while(x % 10 > 0) {
           //System.out.println(x);
           System.out.println(x/10);
           x = x/10;
       }
        return false;
    }

    private static int helper(int n) {
        System.out.println(n%10);

        if(n % 10 ==  0)
            return 0;
        /*
        Logic:
        1. Get the last digit
        2. Get the first digit
         */

        return helper(n/10);
    }
}
