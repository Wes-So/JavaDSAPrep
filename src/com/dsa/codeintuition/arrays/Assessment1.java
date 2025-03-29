package com.dsa.codeintuition.arrays;

import java.util.Arrays;

public class Assessment1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(solution(matrix)));

        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(consecutiveOnes(arr));

        int[] arr2 = {4, 4, 2, 6, 4};
        int target = 10;
        System.out.println(maxAdd(arr2,target));
    }

    public static int maxAdd(int[] arr, int target) {
        int maxAdd = Integer.MAX_VALUE, ctr = 0, sum =0, x=0, y=arr.length;
        while(x < arr.length) {
            ctr++;
            if(sum + arr[x] == target){
                maxAdd = Math.min(maxAdd,ctr);
                System.out.println("MaxAdd:=" + maxAdd);
                ctr = 0;
                sum = 0;
            } else if(sum + arr[x] > target){
                ctr = 0;
                sum = 0;
            } else {
                sum += arr[x];
            }
            x++;
        }
        System.out.println(ctr);
        return maxAdd;
    }

    public static int consecutiveOnes(int[] arr) {
        int maxOnes = Integer.MIN_VALUE;
        int ctr = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                maxOnes = Math.max(maxOnes,ctr);
                ctr = 0;
            }
            ctr++;
        }
        return maxOnes;
    }

    public static int[] solution(int[][] matrix) {
        int[] output = new int[matrix.length * matrix[0].length];

        int jump = matrix[0].length;

        int ctr = -jump;
        for (int i = 0; i < matrix.length; i++) {
            ctr = i;
            for (int anInt : matrix[i]) {
                output[ctr] = anInt;
                ctr+=jump;
            }

        }

        return output;
    }
}
