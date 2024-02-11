package com.dsa.recursion;

public class RemoveChar {
    public static void main(String[] args) {
        String input = "baccad";
        removeChar("", input);
        System.out.println(removeChar2(input));
    }

    static void removeChar(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char letter = unprocessed.charAt(0);
        if(letter != 'a'){
            processed += letter;
        }
        removeChar(processed, unprocessed.substring(1));
    }

    static String removeChar2(String input){
        if(input.isEmpty()){
            return "";
        }

        char letter = input.charAt(0);
        if(letter == 'a'){
            return removeChar2(input.substring(1));
        }

        return letter + removeChar2(input.substring(1));

    }
}
