package com.dsa.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;

        Map<Character,Integer> magazineMap = createMap(magazine);
        Map<Character,Integer> noteMap = createMap(ransomNote);

        for(char key: noteMap.keySet()){
            if(!magazineMap.containsKey(key))
                return false;

            int noteValue = noteMap.get(key);
            int magValue = magazineMap.get(key);

            if(noteValue > magValue)
                return false;
        }

        return true;
    }

    private static Map<Character, Integer> createMap(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length();i++){
            char x = s.charAt(i);
            if(map.containsKey(x)){
                map.put(x,map.get(x) + 1);
            } else {
                map.put(x,1);
            }
        }
        return map;
    }

}
