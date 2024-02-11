package com.dsa.recursion;

public class FindZeros {
    public static void main(String[] args) {
        int n = 30000;
        System.out.println(findZeros(n));
    }

    private static int findZeros(int n) {
        int zero = 0;
        //what my base condition?
        System.out.println(n);
        if(n == 0)
            return zero;

        if(n%10 == 0)
            zero = 1;

        return zero + findZeros(n/10);
    }
}
