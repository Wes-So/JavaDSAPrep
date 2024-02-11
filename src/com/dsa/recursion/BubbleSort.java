package com.dsa.recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        bubbleSort(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int startIdx) {
        if(startIdx >= arr.length)
            return;

        innerSort(arr,0,startIdx);
        bubbleSort(arr,startIdx + 1);
    }

     private static void innerSort(int[] arr, int startIdx, int parentIdx) {
        if(startIdx >= arr.length - parentIdx - 1)
            return;

        if(arr[startIdx] > arr[startIdx+1]) {
            int temp = arr[startIdx];
            arr[startIdx] = arr[startIdx + 1];
            arr[startIdx + 1] = temp;
        }

        innerSort(arr,startIdx + 1, parentIdx);

     }


//    private static void bubbleSort(int[] arr) {
//        boolean swapped = false;
//        for(int i = 0; i < arr.length; i++) {
//            swapped = false;
//            for(int j = 0; j < arr.length -i -1; j++){
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swapped = true;
//                }
//            }
//
//            if(!swapped)
//                break;
//
//        }
}
