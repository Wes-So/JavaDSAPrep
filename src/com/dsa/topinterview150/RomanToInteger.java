package com.dsa.topinterview150;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(transform(roman));

    }

    private static int transform(String roman) {
        //add mapping rules to hashmap
        HashMap<Character, Integer> translation = createTranslation();

        int total = 0;
        for (int i = 0; i < roman.length(); i++) {
            char key = roman.charAt(i);
            if(i > 0 && (key == 'V' || key == 'X' || key == 'L' || key == 'C' || key == 'D' || key == 'M')) {
                if(key == 'V' && roman.charAt(i - 1) == 'I') {
                    total+=3;
                    continue;
                } else if(key == 'X' && roman.charAt(i - 1) == 'I') {
                    total+=8;
                    continue;
                } else if(key == 'L' && roman.charAt(i - 1) == 'X'){
                    total+=30;
                    continue;
                } else if(key == 'C' && roman.charAt(i - 1) == 'X'){
                    total+=80;
                    continue;
                } else if(key == 'D' && roman.charAt(i - 1) == 'C'){
                    total+=300;
                    continue;
                } else if(key == 'M' && roman.charAt(i - 1) == 'C'){
                    total+=800;
                    continue;
                }
            }

            total +=translation.get(key);
            System.out.println("Key:"+ key);
            System.out.println("Total:" + total);
        }
        return total;
    }

    private static HashMap<Character,Integer> createTranslation() {
        HashMap<Character, Integer> translation = new HashMap<>();
        translation.put('I', 1);
        translation.put('V', 5);
        translation.put('X', 10);
        translation.put('L', 50);
        translation.put('C', 100);
        translation.put('D', 500);
        translation.put('M', 1000);
        return translation;
    }
}
