package com.dsa.codeintuition.arrays;

public class FixedSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(kSubarrayAverage(arr,k));

        int[] arr1 = {4, 4, 5, 6, 4};
        int k2 = 3;
        System.out.println(subarraySizeEqualsK(arr1,k2));
    }

    public static double kSubarrayAverage(int[] arr, int k) {
        int start = 0;
        int end = 0;
        double sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        while(end < arr.length){
            sum += arr[end];

            //if sum is more than k elements
            if(end - start + 1 > k){
                sum -= arr[start];
                start++;
            }

            //if sum - equal to k elements
            if(end - start + 1 == k){
                maxAvg = Math.max(maxAvg, sum/k);
            }

            end++;
        }
        return maxAvg;
    }

    public static int subarraySizeEqualsK(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int minValue = Integer.MAX_VALUE;

        if(arr.length < k) return -1;

        while(end < arr.length){
            sum += arr[end];

            //if sum is more than k elements
            if(end - start + 1 > k){
                sum -= arr[start];
                start++;
            }

            //if sum - equal to k elements
            if(end - start + 1 == k){
                minValue = Math.min(minValue, sum);
            }

            end++;
        }
        return minValue;
    }


}
