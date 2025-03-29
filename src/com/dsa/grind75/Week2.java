package com.dsa.grind75;

import java.util.*;

public class Week2 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
        System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
        System.out.println(longestPalindrome("abccccdd"));
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));

    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        Arrays.sort(nums);
        for(int num:nums){
            if(numbers.contains(num)) return false;
            numbers.add(num);
        }
        return true;
    }

    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }
        System.out.println(map);
        int ctr = 0;
        boolean extra = false;
        for(Character letter:map.keySet()){
            int cnt = map.get(letter);
            int modulo = cnt % 2;
            if(modulo == 0) {
                ctr+=cnt;
            } else {
                extra = true;
                ctr+=(cnt - modulo);
            }
        }


        return extra?ctr+1:ctr;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        //in the future can use only one map for magazine then loop around ransomNote
        Map<Character,Integer> ransomMap = new HashMap<>();
        Map<Character,Integer> magMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length() ; i++) {
            ransomMap.put(ransomNote.charAt(i), ransomMap.getOrDefault(ransomNote.charAt(i),0) + 1);
        }

        for (int i = 0; i < magazine.length() ; i++) {
            magMap.put(magazine.charAt(i), magMap.getOrDefault(magazine.charAt(i),0) + 1);
        }

        for(Character letter: ransomMap.keySet()){
            if((magMap.getOrDefault(letter,0) < ransomMap.get(letter))){
                return false;
            }
        }

        return true;

    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = (start + end)/2;

        while(start != end){
            System.out.println("Start:" + start + ",End:" + end + ", Mid:" + mid);
            boolean result = isBadVersion(mid);
            if(!result) {
               start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end)/2;
        }

        return mid;
    }

    public static boolean isBadVersion(int n) {
        return n == 3;
    }
}
