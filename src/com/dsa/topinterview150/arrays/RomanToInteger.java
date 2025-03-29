package com.dsa.topinterview150.arrays;



public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        //String s = "IX";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        int value = 0;

        for (int i = s.length() -1; i > -1; i--) {
            char c = s.charAt(i);
            int singleVal = 0;
            singleVal = getTranslatedValue(c, singleVal);

            //compute value based on exception scenarios
            value+=singleVal;
            if(i==0) return value;

            if(singleVal == 5 || singleVal == 10){
                if(s.charAt(i-1) == 'I'){
                    value-=1;
                    i--;
                }
            }

            if(singleVal == 50 || singleVal == 100){
                if(s.charAt(i-1) == 'X'){
                    value-=10;
                    i--;
                }
            }

            if(singleVal == 500 || singleVal == 1000){
                if(s.charAt(i-1) == 'C'){
                    value-=100;
                    i--;
                }
            }
        }

        return value;
    }

    private static int getTranslatedValue(char c, int singleVal) {
        switch (c){
            case 'I':
                singleVal = 1;
                break;
            case 'V':
                singleVal = 5;
                break;
            case 'X':
                singleVal = 10;
                break;
            case 'L':
                singleVal = 50;
                break;
            case 'C':
                singleVal = 100;
                break;
            case 'D':
                singleVal = 500;
                break;
            case 'M':
                singleVal = 1000;
                break;
        }
        return singleVal;
    }


}
