package com.dsa.topinterview150;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while(left<right){
            int width = right - left;
            int top = Math.min(height[left], height[right]);
            max = Math.max(max, width*top);
            if(height[right] < height[left]){
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
