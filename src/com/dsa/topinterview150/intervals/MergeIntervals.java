package com.dsa.topinterview150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{2,3}, {4,5}, {6,7},{8,9},{1,10}};
        int[][] merged = merge(intervals);
        for(int[] merge:merged){
            System.out.println(Arrays.toString(merge));
        }
    }

    static int[][] merge(int[][] intervals) {
        List<int[]> output = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        int[] initial = intervals[0];
        output.add(initial);
        for(int[] interval : intervals){
            if(interval[0] <= initial[1]){//checking if there is overlap
                initial[1] = Math.max(interval[1], initial[1]);
            } else {
                //no overlapping
                initial = interval;
                output.add(initial);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
