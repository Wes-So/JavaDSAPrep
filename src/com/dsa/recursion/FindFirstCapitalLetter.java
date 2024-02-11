package com.dsa.recursion;

public class FindFirstCapitalLetter {
    public static void main(String[] args) {
        String word = "Geeks";
        System.out.println(findFirstCapitalLetter(word.toCharArray(),word.length() -1));
    }

    private static char findFirstCapitalLetter(char[] letters,int idx) {
        if(idx < 0) {
            return Character.MIN_VALUE;
        }

        if(Character.isUpperCase(letters[idx])){
            return letters[idx];
        }

        return findFirstCapitalLetter(letters,--idx);

    }
}
