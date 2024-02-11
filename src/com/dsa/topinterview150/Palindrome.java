package com.dsa.topinterview150;

public class Palindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int leftIdx = 0;
        int rightIdx = s.length() -1;

        while(leftIdx < rightIdx) {


            while(leftIdx < rightIdx && (!Character.isLetterOrDigit(s.charAt(leftIdx)))) {
                leftIdx++;
            }


            while(leftIdx < rightIdx && (!Character.isLetterOrDigit(s.charAt(rightIdx)))) {
                rightIdx--;
            }

            if(leftIdx == rightIdx)
                return false;

            System.out.println("Left:" + s.charAt(leftIdx));
            System.out.println("Right:" + s.charAt(rightIdx));
            if(Character.toLowerCase(s.charAt(leftIdx)) != Character.toLowerCase(s.charAt(rightIdx))){

                System.out.println("not matching");
                return false;
            }
            leftIdx++;
            rightIdx--;
        }

        return true;

    }

    private static boolean isLetterOrDigit(char c) {
        return Character.isLetterOrDigit(c);
    }
}
