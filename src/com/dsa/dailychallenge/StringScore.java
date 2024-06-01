package com.dsa.dailychallenge;

public class StringScore {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));

    }

    public static int scoreOfString(String s) {
        int x = 0;
        int sum = 0;

        while(x+1 < s.length()){
            System.out.println((int)s.charAt(x));
            System.out.println(s.charAt(x) + "+" + s.charAt(x+1));
            sum+= Math.abs(s.charAt(x) - s.charAt(x+1));
            x++;
        }
        return sum;
    }
}
