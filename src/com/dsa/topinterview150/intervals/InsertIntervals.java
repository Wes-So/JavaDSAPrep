package com.dsa.topinterview150.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        //int[][] intervals = {{1,2},{3,5}, {6,7}, {8,10}, {12,16}};
        int[][] intervals = {{}};
        int[] newInterval ={6,8};
        insert(intervals,newInterval);
    }


    static boolean isOverlap(int[] a, int[] b){
        return a[0] <= b[1] && b[0] <= a[1];
    }
    static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> output = new ArrayList<>();


        int[][] intervalsPlus = createIntervalsPlus(intervals,newInterval);
        int[] initial = intervalsPlus[0];
        output.add(initial);
        for(int[] interval : intervalsPlus){

            if(interval[0] <= initial[1]){//checking if there is overlap
                initial[1] = Math.max(interval[1], initial[1]);
            } else {
                //no overlapping
                initial = interval;
                output.add(initial);
            }
        }

        for(int[] interval:output){
            System.out.println(Arrays.toString(interval));
        }
        return output.toArray(new int[output.size()][]);
    }

    private static int[][] createIntervalsPlus(int[][] intervals,int[] newInterval) {

        if(intervals.length == 1 && intervals[0].length == 0){
            intervals[0] = newInterval;
            return intervals;
        }

        int[][] plus = new int[intervals.length + 1][];
        for (int i = 0; i < intervals.length ; i++) {
            plus[i] = intervals[i];
        }

        plus[plus.length -1] = newInterval;
        Arrays.sort(plus, Comparator.comparingInt(i -> i[0]));
        return plus;
    }
}
