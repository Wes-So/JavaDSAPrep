package com.dsa.recursion;

public class PrintWithoutLoop {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }

        int temp = n;
        print(--n);
        System.out.println(temp);
    }

    private static void printLoop(int n) {
        while(n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
