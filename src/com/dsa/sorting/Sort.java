package com.dsa.sorting;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        selectionSortRecursion(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //find the max
            int maxIdx = findMaxIndex(arr,i, arr.length - i);
            swap(arr, maxIdx, arr.length - i - 1);
            if(maxIdx == arr.length - i - 1)
                break;
         }
        System.out.println("Selection Sort:" + Arrays.toString(arr));
    }

    private static void selectionSortRecursion(int[] arr, int idx) {
        if(idx >= arr.length)
            return;

        int limit = arr.length - idx;
        int maxIdx = findMaxIndex(arr,0, limit);

        swap(arr, maxIdx, limit - 1);
        selectionSortRecursion(arr,idx + 1);
    }

    private static void insertionSort(int[] arr) {

        for(int i = 0; i < arr.length -1; i++){
            for(int j = i  + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                    //swap(arr,j, j-1);
                    System.out.println(Arrays.toString(arr));
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int maxIdx, int swapIdx){
        int temp = arr[swapIdx];
        arr[swapIdx] = arr[maxIdx];
        arr[maxIdx] = temp;
    }
    private static int findMaxIndex(int[] arr, int start, int end) {
        int maxIdx = 0;

        for (int j = start; j < end; j++) {
            if (arr[j] > arr[maxIdx]) {
                maxIdx = j;
            }
        }

        return maxIdx;
    }


    private static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            for(int j = 0; j < arr.length -i -1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped)
                break;

        }
        System.out.println("BubbleSort:" + Arrays.toString(arr));
    }
}
