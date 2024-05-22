package com.dsa.topinterview150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<Character, String> bank = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            Character letter = pattern.charAt(i);
            String word = words[i];

            if(!bank.containsKey(letter)){
                if(bank.containsValue(word)) return false;
                bank.put(letter, word);
            } else {
                if(!bank.get(letter).equals(word)) return false;
            }
        }
        return true;
    }
}
