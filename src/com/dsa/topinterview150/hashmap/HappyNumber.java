package com.dsa.topinterview150.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    // Loop until either n becomes 1 (in which case n is a happy number)
    // or n is seen again (in which case n is not a happy number)

    static boolean isHappy(int n) {
        Set<Integer> check = new HashSet<>();
        while(n != 1 && !check.contains(n)){
            //main loop
            //add n first
            check.add(n);

            //compute sum of numbers
            int total = 0;
            while(n !=  0){
                int x = n%10;
                total+=x*x;
                n/=10;
            }
            System.out.println(total);
            n=total;
        }

        return n == 1;
    }

}
