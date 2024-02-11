package com.dsa.recursion;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        findMinMax(arr, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        //System.out.println(findMinRec(arr,arr.length));
    }

    public static int findMinRec(int A[], int n)
    {
        // if size = 0 means whole array
        // has been traversed
        if(n == 1)
            return A[0];

        return Math.min(A[n-1], findMinRec(A, n-1));
    }

    private static void findMinMax(int[] arr, int i, int max, int min) {
        //base condition
        if(i >= arr.length) {
            System.out.println(max);
            System.out.println(min);
            return;
        }

        if(arr[i] < min)
            min = arr[i];

        if(arr[i] > max) {
            max = arr[i];
        }

        findMinMax(arr, i + 1, max, min);

    }
}

