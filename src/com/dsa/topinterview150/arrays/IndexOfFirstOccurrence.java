package com.dsa.topinterview150.arrays;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack,needle));

    }

    public static int strStr(String haystack, String needle) {
        int idx = -1;
        int right = 0;
        String temp = "";

        for (int left = 0; left < haystack.length(); left++) {
            right = left+1;
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
}
