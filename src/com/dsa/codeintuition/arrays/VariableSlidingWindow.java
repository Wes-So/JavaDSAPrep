package com.dsa.codeintuition.arrays;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //System.out.println(kadanesAlgorithm(arr));

        int[] arr2 = {-1, -2, -3, -4, -5};
        System.out.println(largestProductSubarray(arr2));

    }

    public static int largestProductSubarray(int[] arr) {
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        int start = 0,end = 0;

        while(end < arr.length){
            product *= Math.abs(arr[end]);
            maxProduct = Math.max(maxProduct,product);
            if(product == 0){
                start = end + 1;
                product = 1;
            }
            end++;
        }


        return maxProduct;
    }

    public static int kadanesAlgorithm(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0,end = 0;

        while(end < arr.length){
            sum += arr[end];
            maxSum = Math.max(maxSum,sum);
            if(sum < 0){
                start = end + 1;

                sum = 0;
            }
            end++;
        }
        return maxSum;
    }

    

}
