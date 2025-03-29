package com.dsa.codeintuition.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intervals {
    public static void main(String[] args) {
//        int[][] meetings = {{1, 20}, {10, 30}, {30, 40},{1, 5}};
//        System.out.println(verifySchedule(meetings));
//
//        int[][] intervals = {{1, 4}, {2, 3}, {3, 4},{4, 6}};
//        int[][] merged = overlapReduction(intervals);
//        for (int[] ints : merged) {
//            System.out.println(Arrays.toString(ints));
//        }

        int[][] intervals2 = {{1, 2}, {2, 3}, {3, 4},{1, 3}};
        System.out.println(removeIntervals(intervals2));

        int[][] intervals3 = {{1, 5}, {1, 5}, {1, 5}};
        System.out.println(removeIntervals(intervals3));
    }

    public static int removeIntervals(int[][] intervals) {

        List<int[]> points = new ArrayList<>();

        //convert intervals to points
        for (int[] interval : intervals) {
            points.add(new int[]{interval[0], 's'});
            points.add(new int[]{interval[1], 'e'});
        }

        //sort points array list
        Collections.sort(points,(a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Character.compare((char) a[1], (char) b[1]);
        });

        //process points array
        int overlap = 0, maxOverlap = 0;

        for(int[] point : points) {
            if(point[1] == 's'){
                overlap++;
                maxOverlap = Math.max(overlap,maxOverlap);
            } else {
                overlap--;
            }
        }


        return maxOverlap > 0?maxOverlap - 1:0;
    }

    public static boolean verifySchedule(int[][] meetings) {

        Arrays.sort(meetings, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(meetings[0]);

        for (int i = 1; i < meetings.length ; i++) {
            int[] lastMerged = merged.get(merged.size() - 1);
            int[] current = meetings[i];
            if(current[0] < lastMerged[1]){
                return false;
            } else {
                merged.add(current);
            }
        }

        return true;
    }

    public static int[][] overlapReduction(int[][] intervals) {
        Arrays.sort(intervals,(int[] a, int[] b)-> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] lastInterval = merged.get(merged.size() - 1);
            int[] current = intervals[i];
            if(current[0] <= lastInterval[1]){
                lastInterval[1] = Math.max(current[1], lastInterval[1]);
            } else {
                merged.add(current);
            }
        }

        int[][] output = new int[merged.size()][];
        int idx = 0;
        for(int[] interval: merged){
            output[idx++] = interval;
        }

        return output;
    }
}
