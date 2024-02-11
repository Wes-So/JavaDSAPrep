package com.dsa.topinterview150.hashmap;

import java.sql.SQLOutput;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams2(strs));
    }




    static List<List<String>> groupAnagrams2(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(newWord,temp);
            }
        }

        return new ArrayList<>(map.values());

    }


}
