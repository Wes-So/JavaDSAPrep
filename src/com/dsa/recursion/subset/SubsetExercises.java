package com.dsa.recursion.subset;

public class SubsetExercises {
    public static void main(String[] args) {
        String input = "abc";
        subset("",input);
    }

    static void subset(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char letter = unprocessed.charAt(0);
        //take scenario
        subset(processed + letter,unprocessed.substring(1));
        //remove scenario
        subset(processed, unprocessed.substring(1));
    }
}
