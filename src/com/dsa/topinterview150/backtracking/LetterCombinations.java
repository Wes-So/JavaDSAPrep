package com.dsa.topinterview150.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        List<String> output = letterCombinations("");
        System.out.println(output);
    }

    static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return Collections.emptyList();
        }
        return subset("",digits);
    }

    static List<String> subset(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            List<String> output = new ArrayList<>();
            output.add(processed.trim());
            return output;
        }


        int digit = unprocessed.charAt(0) - '0';
        int start = (digit - 2)*3;
        int end = ((digit -1) * 3);

        if(digit >= 8){
            start++;
        }

        if(digit >= 7){
            end++;
            if(digit == 9)
                end++;
        }

        List<String> output = new ArrayList<>();

        for (int i = start; i < end; i++) {
            char letter2 = (char) ('a' + i);
            output.addAll(subset(processed + letter2,unprocessed.substring(1) ));
        }
        return output;
    }
}
