package com.dsa.topinterview150;

public class Subsequence {
    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        int i1 = 0;
        int i2 = 0;
        while(i2 < t.length() && i1 < s.length()) {
            System.out.println("s-letter:" + s.charAt(i1));
            System.out.println("t-letter:" + t.charAt(i2));

            if(s.charAt(i1) == t.charAt(i2)) {
                i1++;
                i2++;
            } else {
                i2++;
            }
        }
        System.out.println(i1);
        return i1 == s.length();
    }


}
