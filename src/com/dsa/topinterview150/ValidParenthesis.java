package com.dsa.topinterview150;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String test  = "([]){";
        System.out.println(isValid2(test));

    }

    private static boolean isValid2(String x) {
        Stack<Character> openChars = new Stack<>();
        boolean isValid = false;
        for (int i = 0; i < x.length(); i++) {
            char symbol = x.charAt(i);
            if(symbol == '{' || symbol == '(' || symbol == '['){
                openChars.push(symbol);
            }

            if(symbol == '}' || symbol == ')' || symbol == ']'){
                if(openChars.empty())
                    return false;
                char close = openChars.pop();
                System.out.println(close);
                System.out.println(symbol);
                if((symbol == '}' && close == '{') ||
                        (symbol == ')' && close == '(') ||
                        (symbol == ']' && close == '[') ) {
                    isValid = true;
                } else {
                    return false;
                }
            }

        }

        if(!openChars.empty())
            isValid = false;

        return isValid;
   }
}
