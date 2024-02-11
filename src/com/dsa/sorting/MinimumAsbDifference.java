package com.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MinimumAsbDifference {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int diff = getDiff(arr);
        List<List<Integer>> absDiff = new ArrayList<>();
        System.out.println(diff);
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j <arr.length; j++){
                int ctr = Math.abs(arr[i] - arr[j]);
                if(ctr == diff){
                    List<Integer> item = new ArrayList<>();
                    item.add(arr[i]);
                    item.add(arr[j]);
                    absDiff.add(item);
                }
            }
        }
        return absDiff;
    }

    private static void insertionSort(int[] arr) {

    }
    private static int getDiff(int[] arr) {
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) < diff){
                    diff = Math.abs(arr[i] - arr[j]);
                }
            }
        }
        return diff;
    }
}