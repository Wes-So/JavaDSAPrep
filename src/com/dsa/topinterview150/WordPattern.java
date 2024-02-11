package com.dsa.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));

    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> pMap = new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            if(!pMap.containsKey(pattern.charAt(i))) {
                if(pMap.containsValue(words[i])){
                    return false;
                }
                pMap.put(pattern.charAt(i),words[i]);
            } else {
                if(!words[i].equals(pMap.get(pattern.charAt(i)))){
                    return false;
                }
            }
        }

        return true;
    }




}
