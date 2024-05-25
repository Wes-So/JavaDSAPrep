package com.dsa.dailychallenge;

public class ReversePrefix {
    public static void main(String[] args) {
        char ch = 'd';
        String word = "abcdefg";
        System.out.println(reversePrefix(word,ch));
    }

    public static String reversePrefix(String word, char ch) {
        /*
            1. Get the substring to reverse and then reverse
            2. Get the remaining letters
         */

        int idx = word.indexOf(ch);
        String prefix = word.substring(0,idx + 1);
        String suffix = word.substring(idx + 1);
        StringBuilder reverse = new StringBuilder(prefix);
        return reverse.reverse().toString() + suffix;

    }
}
