package com.dsa.dailychallenge;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String word = "hello";
        char[] s = word.toCharArray();
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i<j){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }

    }

}
