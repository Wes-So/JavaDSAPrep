package com.dsa.topinterview150.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber2 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));

    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        //continue processing until n != 1 and set doesn't contain n
        while(n != 1 && !set.contains(n)){
            System.out.println(n);
            set.add(n);
            while(n!=0){
                sum += Math.pow(n%10,2);
                n /=10;
            }
            n = sum;
            sum = 0;
        }

        return n == 1;


    }


}
