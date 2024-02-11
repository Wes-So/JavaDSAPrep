package com.dsa.recursion;

public class Product2Numbers {

    public static void main(String[] args) {
        int x = 2;
        int y = 10;
        int product = sum(x,y);
        System.out.println(product);

    }

    private static int sum(int x, int y) {
        if(y == 1)
            return x;

        y = y - 1;
        return x + sum(x, y);

    }

}
