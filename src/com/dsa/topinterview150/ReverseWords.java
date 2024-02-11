package com.dsa.topinterview150;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder newWord = new StringBuilder();
        for (int i = words.length -1; i > -1 ; i--) {
            System.out.println("word:" + words[i].trim());
            if(words[i].trim().length() > 0){
                newWord.append(" ");
                newWord.append(words[i].trim());
            }

        }
        return newWord.toString();
    }
}
