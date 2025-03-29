package com.dsa.bugbash;

import java.util.Stack;

public class Bugs {

    public static void main(String[] args) {
        String str = "))(())";
        System.out.println(balancedParentheses(str));
    }

    public static boolean balancedParentheses(String str) {

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.add(ch);
            } else if (ch == ')') {
                if(stack.empty()) return false;
                if(!stack.empty() && stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
