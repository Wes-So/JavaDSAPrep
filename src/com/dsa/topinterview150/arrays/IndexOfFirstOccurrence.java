package com.dsa.topinterview150.arrays;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr2(haystack,needle));

    }

    public static int strStr(String haystack, String needle) {
        int idx = -1;
        int right = -1;
        String temp = "";

        for (int left = 0; left < haystack.length(); left++) {
            right = left;
            while(right < haystack.length()) {
                temp = haystack.substring(left, right+1);

                if(needle.equals(temp)) return left;

                if(needle.startsWith(temp)){
                    right++;
                } else {
                    break;
                }
            }
        }
        return idx;
    }


    public static int strStr2(String haystack, String needle) {
        int i = 0;
        int j = needle.length();
        while(j<=haystack.length()){
            if(needle.equals(haystack.substring(i,j))){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}
