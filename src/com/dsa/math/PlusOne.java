package com.dsa.math;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        int[] out = plusOne(digits);
        System.out.println(Arrays.toString(out));
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length -1; i > -1 ; i--) {
            System.out.println(digits[i]);
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    private static int[] convertToArr(BigInteger num) {
        String numStr = num.toString();
        int[] newArr = new int[numStr.length()];
        for (int j = 0; j < numStr.length() ; j++) {
            System.out.println(numStr.charAt(j));
            newArr[j] =  Character.getNumericValue(numStr.charAt(j));
        }

        return newArr;
    }

    private static BigInteger convertToInt(int[] digits){
        BigInteger out = BigInteger.valueOf(0);
        BigInteger ten = BigInteger.valueOf(10);
        for (int digit : digits) {
            out = out.multiply(ten).add(BigInteger.valueOf(digit));
        }

        return out;

    }
}
