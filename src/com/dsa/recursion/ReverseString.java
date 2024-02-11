package com.dsa.recursion;

class ReverseString {

    public static void main(String[] args) {
        char[] word = "wes".toCharArray();
        //reverseString(word);
        int end = word.length  -1;
        reverseStringRecursion(word,0, end);
        System.out.println(word);
    }
    public static void reverseString(char[] s) {
        for(int i=0; i<s.length - i; i++) {
            int idx = s.length - i - 1;
            char temp = s[idx];
            s[idx] = s[i];
            s[i] = temp;
            System.out.println(s);
        }
    }

    private static void reverseStringRecursion(char[] s, int start, int end) {

        if(start >= s.length - start)
            return;

        //swap
        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;

        start = start + 1;
        end = s.length - start -1;
        reverseStringRecursion(s,start,end);
    }
}