package com.dsa.recursion;

public class StringLength {

    public static void main(String[] args) {
        String word = "outlandish";
        System.out.println(count(word));
    }

    private static int count(String word) {
        if(word == "") {
            return 0;
        } else {
            return 1 + count(word.substring(1));
        }
    }
}
