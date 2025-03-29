package com.dsa.codeintuition.arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, };
        System.out.println(consecutiveOnes(arr));
    }

    public static int consecutiveOnes(int[] arr) {
        int end = 0;
        int maxOnes = Integer.MIN_VALUE;
        int sum = 0;

        while(end < arr.length){
            if(arr[end] == 1){
                sum++;
            } else {
                maxOnes = Math.max(maxOnes,sum);
                sum = 0;
            }
            end++;
        }

        maxOnes = Math.max(maxOnes,sum);

        return maxOnes;

    }
}
