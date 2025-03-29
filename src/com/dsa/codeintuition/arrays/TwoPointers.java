package com.dsa.codeintuition.arrays;

public class TwoPointers {
    public static void main(String[] args) {
        String s = "abcdefghijkl";
        int k = 2;
        System.out.println(reverseSegments(s,k));

    }

    public static String reverseSegments(String s, int k) {

        if(k == 1) return s;
        int x = 0, y = 2*k - 1;

        char[] letters = s.toCharArray();
        while(y < letters.length){
            swap(letters,x,(x+k) -1);
            x = y + 1;
            y = (x + 2*k) - 1;
        }

        if(s.length() - x <=k){
            swap(letters,x, s.length() - 1);
        }

        return new String(letters);
    }


    private static void swap(char[] letters, int x, int y){
        while(x < y){
            char temp = letters[x];
            letters[x] = letters[y];
            letters[y] = temp;
            x++;
            y--;
        }
    }
}
