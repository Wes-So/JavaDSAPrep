package com.dsa.topinterview150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        //System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> bank = new HashMap<>();
        Map<Character, Character> bank2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(bank.containsKey(s.charAt(i))) {
                if(!bank.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else if(bank2.containsKey(t.charAt(i))){
                if(!bank2.get(t.charAt(i)).equals(s.charAt(i))){
                    return false;
                }
            } else {
                bank.put(s.charAt(i), t.charAt(i));
                bank2.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }


}
