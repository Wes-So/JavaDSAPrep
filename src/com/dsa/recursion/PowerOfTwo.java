package com.dsa.recursion;

class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        //System.out.println(isPowerOfTwo(n));

        int n2 = 27;
        System.out.println(isPowerOfThree(n2));
    }


    public static boolean isPowerOfTwo(int n) {
        n = Math.abs(n);

        if(n == 2 || n ==1)
            return true;

        if (n==0 || n%2 != 0)
            return false;

        return isPowerOfTwo(n/2);

    }

    public static boolean isPowerOfThree(int n) {
        n = Math.abs(n);

        if(n == 3)
            return true;

        if (n%3 != 0)
            return false;

        return isPowerOfThree(n/3);

    }
}
