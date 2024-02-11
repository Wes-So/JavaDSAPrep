package com.dsa.topinterview150.stack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN2(tokens));
    }

    static int evalRPN(String[] tokens) {
        Stack<String> stack  = new Stack<String>();
        List<String> operands = getStrings();
        int total = 0;

        for (int i = 0; i < tokens.length ; i++) {
            //if not in (+ - * /) add to stack
            if(!operands.contains(tokens[i])){
                stack.push(tokens[i]);
                System.out.println(stack);
            } else {
                //start extracting stack
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                System.out.println(a + tokens[i] + b);
                switch (tokens[i]) {
                    case ("+"):
                        total = a+b;
                        break;
                    case ("-"):
                        total = a-b;
                        break;
                    case ("*"):
                        total = a*b;
                        break;
                    case ("/"):
                        total = a/b;
                        break;
                }
                stack.push(String.valueOf(total));
            }
        }
        return Integer.parseInt(stack.pop());
    }

    static int evalRPN2(String[] tokens) {
        Stack<String> stack  = new Stack<String>();
        int total = 0;
        int a  = 0;
        int b = 0;

        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case ("+"):
                    b = Integer.parseInt(stack.pop());
                    a = Integer.parseInt(stack.pop());
                    total = a + b;
                    stack.push(String.valueOf(total));
                    break;
                case ("-"):
                    b = Integer.parseInt(stack.pop());
                    a = Integer.parseInt(stack.pop());
                    total = a - b;
                    stack.push(String.valueOf(total));
                    break;
                case ("*"):
                    b = Integer.parseInt(stack.pop());
                    a = Integer.parseInt(stack.pop());
                    total = a * b;
                    stack.push(String.valueOf(total));
                    break;
                case ("/"):
                    b = Integer.parseInt(stack.pop());
                    a = Integer.parseInt(stack.pop());
                    System.out.println(b + "/" + a);
                    total = a / b;
                    stack.push(String.valueOf(total));
                    break;
                default:
                    stack.push(tokens[i]);

            }

        }
        return Integer.parseInt(stack.pop());
}


    private static List<String> getStrings() {
        List<String> operands = new ArrayList<>();
        operands.add("+");
        operands.add("-");
        operands.add("*");
        operands.add("/");
        return operands;
    }
}
