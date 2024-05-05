package com.dsa.topinterview150.arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("Final Prefix:=" + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];

        //Get the first word
        String prefix = strs[0];
        int firstWordLen = prefix.length();

        for(int i = 1; i < strs.length; i++) {
             //until length is gone or until a match is found.  we're starting at the end
            // so we're comparing the longest first
           while(firstWordLen > 0 && strs[i].indexOf(prefix) != 0){
               firstWordLen--;
               prefix = prefix.substring(0,firstWordLen);
            }
           if(prefix.isEmpty()) return prefix;
        }

       return prefix;
    }
}
