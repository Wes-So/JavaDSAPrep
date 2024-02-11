package com.dsa.search;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        //int[] numbers = {1,2,3,4,4,9,56,90};
        int[] numbers = {5,25,75};
        int target = 100;
        //System.out.println(Arrays.toString(twoSumBinary(numbers, target)));

        int arrangeCoinsInput = 1;
        //int arrangeCoinsAnswer = arrangeCoins(arrangeCoinsInput);
        //System.out.println(arrangeCoinsAnswer);

        int[] numbers2 = {7,1,14,11};
        boolean answer = checkIfExist(numbers2);
        System.out.println(answer);
    }

    public static boolean checkIfExist(int[] arr) {

        for(int i =0; i<arr.length;i++){
            int j = 0;
            int num = arr[i];
            while(j<arr.length){
                if(j != i && (arr[j] * 2) == num){
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public static int arrangeCoins(int n) {
        int answer = 0;
        int ladder = 1;
        while(ladder <= n){
            n -= ladder;
            ladder++;
            answer++;
            System.out.println(ladder + ":" + answer + ":" + n);
        }

        return answer;
    }


    public static int mySqrt(int x) {
        //solution: divide until results become 1
        int result = x;
        while (true) {
            System.out.println(result);
            if ((result == 0) || (result ==1) || (result/2 ==1)) {
                return result;
            } else {
                result = result/2;
            }
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        for(int i = 0; i<numbers.length;i++){
            int tracker = i + 1;
            while(tracker < numbers.length) {
                if(numbers[i] + numbers[tracker] == target) {
                    output[0] = i + 1;
                    output[1] = tracker  + 1;
                    return output;
                }
                tracker++;
            }

        }
        return output;
    }

    public static int[] twoSumBinary(int[] numbers, int target) {
        int[] output = new int[2];
        int start = 0;
        int end;

        for(int i = 0; i<numbers.length;i++) {
            start = i + 1;
            end = numbers.length -1;
            while(start <= end) {
                int mid = start + (end - start)/2;
                System.out.println("Strt-end-mid=" + start + ":" + end + ":" + mid);
                if(numbers[i] + numbers[mid] < target){
                    start = mid + 1;
                } else if (numbers[i] + numbers[mid] > target) {
                    end = mid -1;
                } else if (numbers[i] + numbers[mid] == target){
                    output[0] = i + 1;
                    output[1] = mid  + 1;
                    return output;
                }
            }
        }
        return output;
    }
}
