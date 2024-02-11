package com.dsa.topinterview150.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max_sub = 1;
        List<Character> letters = new ArrayList<>();

        if(s.isEmpty())
            return 0;

        while(r<s.length()){
            if(letters.contains(s.charAt(r))){
                //reset
                max_sub = Math.max(letters.size(), max_sub);
                letters.remove(0);

            } else {
                letters.add(s.charAt(r));
                r++;
            }

        }
        return Math.max(max_sub, letters.size());
    }
}
