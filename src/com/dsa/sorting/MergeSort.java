package com.dsa.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {3};
        int[] b = {4};
        int[] d = merge(a,b);
//        System.out.println(Arrays.toString(d));
        int[] c = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergeSort(c)));

    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] mergeSortInPlace(int[] arr, int start, int end) {
        if(arr.length == 1)
            return arr;

        int mid = arr.length/2;
        int[] left = mergeSortInPlace(arr, start, mid);
        int[] right = mergeSortInPlace(arr, mid, arr.length);
        return null;
    }

    static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int x = 0;

        while(i < a.length && j < b.length) {
           if(a[i] < b[j]) {
               c[x] = a[i];
               i++;
           } else {
               c[x] = b[j];
               j++;
           }
           x++;
        }

        //leftover
        while(i < a.length){
            c[x] = a[i];
            i++;
            x++;
        }

        while(j < b.length) {
            c[x] = b[j];
            j++;
            x++;
        }
        return c;
    }
}
