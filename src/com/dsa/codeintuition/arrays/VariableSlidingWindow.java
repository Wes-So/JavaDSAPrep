package com.dsa.codeintuition.arrays;

import java.util.HashMap;
import java.util.Map;

public class VariableSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //System.out.println(kadanesAlgorithm(arr));

        int[] arr2 = {-1,-2,-3,-4,-5};
        //System.out.println(largestProductSubarray(arr2));

        int[] arr3 = {2, 1, 3, 4, 1, 2, 1, 5, 4};
        int target = 8;
        //System.out.println(Arrays.toString(targetedSumSubarray(arr3,target)));

        int[] arr4 = {7, 1, 2, 3, 7, 5, -5, 8};
        int k = 7;
        System.out.println(subarraySumEqualsK(arr4,k));


    }

    public static int subarraySumEqualsK(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];

            if(prefixSum == k){
                count = i + 1;
            }

            if(map.containsKey(k-prefixSum)){
                count = Math.max(count, map.get(k-prefixSum));
            }

            map.putIfAbsent(prefixSum,i);
        }

        return count;
    }





    public static int largestProductSubarray(int[] arr) {
        int product = 1;
        //if(arr[0] < 0) product = -1;
        int maxProduct = Integer.MIN_VALUE;
        int start = 0,end = 0;


        while(end < arr.length){
            product *= arr[end];
            maxProduct = Math.max(maxProduct,product);
            if(product < 0){
                start = end + 1;
                product = 1;
            }


            end++;
        }


        return maxProduct;
    }




    public static int[] targetedSumSubarray(int[] arr, int target) {
        int[] output = {-1, -1};
        int start = 0, end = 0;
        int sum = 0;
        while(end < arr.length){
           sum += arr[end];

           if(sum > target) {
               sum = sum - arr[start];
               start++;
           }

           if(sum == target){
                output[0] = start;
                output[1] = end;
                return output;
            }

           end++;
        }

        return output;
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
