package com.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    private static int factorial(int n){
        if(n == 1)
            return n;

        return n * factorial(n-1);
    }
}
