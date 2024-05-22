package com.dsa.topinterview150.hashmap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s = "car";
        String t = "tar";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        String sortedS = new String(sArray);

        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        String sortedT = new String(tArray);

        return sortedS.equals(sortedT);
    }
}
