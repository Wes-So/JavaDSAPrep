package com.dsa.codeintuition.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2,};

        System.out.println(uniqueIntersections(arr1,arr2));
    }

    public static List<Integer> uniqueIntersections(int[] arr1, int[] arr2) {
        int idx1 = 0;
        int idx2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> output = new ArrayList<>();

        while(idx1 < arr1.length && idx2 < arr2.length){

            if(arr1[idx1] == arr2[idx2]){
                if(!output.contains(arr1[idx1])){
                    output.add(arr1[idx1]);
                }

                idx1++;
                idx2++;
            } else if(arr1[idx1] < arr2[idx2]){
                idx1++;
            } else {
                idx2++;
            }
        }

        return output;
    }

    public List<Integer> repeatedIntersections(int[] arr1, int[] arr2) {
        int idx1 = 0;
        int idx2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> output = new ArrayList<>();

        while(idx1 < arr1.length && idx2 < arr2.length){

            if(arr1[idx1] == arr2[idx2]){
                output.add(arr1[idx1]);
                idx1++;
                idx2++;
            } else if(arr1[idx1] < arr2[idx2]){
                idx1++;
            } else {
                idx2++;
            }
        }

        return output;
    }

}

