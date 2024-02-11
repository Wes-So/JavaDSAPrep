package com.dsa.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character,Character> letterMap = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char letter = s.charAt(i);
            if(letterMap.containsKey(letter)){
                if(t.charAt(i) != letterMap.get(letter))
                    return false;
            } else {
                if(letterMap.containsValue(t.charAt(i))){
                    return false;
                }
                letterMap.put(letter,t.charAt(i));
            }
        }
        return true;
    }
}
