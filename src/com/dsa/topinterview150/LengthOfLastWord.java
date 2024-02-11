package com.dsa.topinterview150;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int idx = s.lastIndexOf(' ');
        String newWord = s.substring(idx + 1).trim();
        if(newWord.length() == 0) {
            s = s.substring(0,idx).trim();
            idx = s.lastIndexOf(" ");
            newWord = s.substring(idx + 1).trim();
        }
        return newWord.length();
    }
}
