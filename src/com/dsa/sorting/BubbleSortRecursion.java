package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int i = 0;
        sort(arr, i,i  + 1);

    }

    private static void sort(int[] arr, int e1, int e2) {
        if(e1 >= arr.length)
            return;

        if(arr[e2] < arr[e2 - 1]) {
            //swap
            int temp = 0;
            temp = arr[e2];
            arr[e2] = arr[e2 -1];
            arr[e2 - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("e2:" + e2);
        if(e2  +  1 > arr.length - e1 - 1){
            e2 = 0;
            e1++;
        }
        sort(arr,e1, e2 + 1);

    }
}
