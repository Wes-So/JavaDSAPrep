package com.dsa.topinterview150.stack;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));

        String s1 = "]";
        System.out.println(isValid(s1));
    }

    public static boolean isValid(String s) {
        /*
            1. When you encounter an opening bracket, push it to the top of the stack.
            2.When you encounter a closing bracket, check if the top of the stack was the opening for it. If yes, pop it from the stack.
              Otherwise, return false.
         */
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '[') {
                stack.add(s.charAt(i));
            } else if(c == '}' || c == ')' || c == ']') {
                if(stack.isEmpty()) return false;
                char o = stack.pop();
                if(c == '}' && o != '{') return false;
                if(c == ')' && o != '(') return false;
                if(c == ']' && o != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}
