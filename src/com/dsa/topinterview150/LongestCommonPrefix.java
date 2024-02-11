package com.dsa.topinterview150;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"ab", "a"};
        System.out.println(longestCommonPrefix(arr));
    }

    static String longestCommonPrefix(String[] strs) {
        int i = 0;
        int j = 1;

        String firstWord = strs[0];
        char letter = ' ';
        String prefix = "";

        while(i<firstWord.length()) {
            letter = firstWord.charAt(i);
            System.out.println("letter:" + letter);
            //loop around strs
            while(j < strs.length) {
                System.out.println("Word:" + strs[j]);

                if(i >= strs[j].length())
                    return prefix;

                if(letter != strs[j].charAt(i) ){
                   return prefix;
                }
                 j++;
            }
            prefix += letter;
            System.out.println(prefix);
            i++;
            j = 1;
        }

        return prefix;

    }
}
