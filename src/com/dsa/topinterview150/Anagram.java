package com.dsa.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "aa", t = "bb";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character, Integer> s_letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(s_letters.containsKey(s.charAt(i))){
                s_letters.put(s.charAt(i),s_letters.get(s.charAt(i)) + 1);
            } else {
                s_letters.put(s.charAt(i), 1);
            }
        }

        Map<Character, Integer> t_letters = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if(t_letters.containsKey(t.charAt(i))){
                t_letters.put(t.charAt(i),t_letters.get(t.charAt(i)) + 1);
            } else {
                t_letters.put(t.charAt(i), 1);
            }
        }

        for(Character sLetter:s_letters.keySet()) {
            if(!t_letters.containsKey(sLetter))
                return false;

            int sLetterVal = s_letters.get(sLetter);
            int tLetterVal = t_letters.get(sLetter);
            if(sLetterVal != tLetterVal)
                return false;
        }

        return true;
    }
}
