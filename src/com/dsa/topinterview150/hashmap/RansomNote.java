package com.dsa.topinterview150.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean canConstruct = true;
        Map<Character, Integer> bank = new HashMap<>();

        //#1 put all letters in the hashmap
        for(int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            bank.put(letter, bank.getOrDefault(letter, 0) + 1);
        }

        //#2 process ransom note
        for(int i = 0; i <ransomNote.length() ; i++) {
            char letter = ransomNote.charAt(i);
            if(bank.getOrDefault(letter, 0) > 0){
                bank.put(letter, bank.getOrDefault(letter, 0) - 1);
            } else {
                return false;
            }
        }

        return canConstruct;
    }
}
