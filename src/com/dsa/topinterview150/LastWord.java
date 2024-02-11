package com.dsa.topinterview150;

import java.util.Arrays;

public class LastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        String lastWord = arr[arr.length - 1];
       // int idx = s.trim().lastIndexOf(' ') + 1;
        //System.out.println(idx);
        //String lastWord = s.substring(idx);
        System.out.println(lastWord.trim());
        return lastWord.trim().length();
    }
}
