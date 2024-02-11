package com.dsa.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] nums = {2,1,3,2,3,6,4,1,4};
        //System.out.println(findUnique(nums));
        System.out.println(5^5);
    }

    private static int findUnique(int[] nums) {
        int unique = 0;
        for(int n : nums) {
            System.out.print("N:" + n + ",");
            System.out.println("Unique:" + unique);
            unique ^= n;
            System.out.println(unique);
        }
        return unique;
    }
}
