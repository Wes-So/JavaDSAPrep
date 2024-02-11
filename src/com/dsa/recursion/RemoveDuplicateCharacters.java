package com.dsa.recursion;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String word = "aabccba";
        String blank = "";
        System.out.println(removeDups(word,""));
    }

    private static String removeDups(String word, String dup) {
        if(word.length() == 0)
            return "";

        String add ="";

        if(!dup.equals(word.substring(0,1))){
            dup = word.substring(0,1);
            add = dup;
        }

        return add + removeDups(word.substring(1), dup);
    }
}
