package com.dsa.sorting;

import java.util.Arrays;

class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] original = heights.clone();
        sort(heights);
        int count = diff(original, heights);


        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(heights));
        return count;
    }

    private static int diff(int[] original, int[] heights) {
        int count = 0;
        for(int i = 0; i<heights.length;i++){
            if(heights[i] != original[i])
                count++;
        }
        return count;
    }

    private static void sort(int[] heights) {
        boolean swapped = true;
        for(int i = 0; i< heights.length; i++) {
            swapped = false;
            for(int j = 0; j < heights.length - i -1; j++) {
                if(heights[j] >= heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;

        }
    }
}