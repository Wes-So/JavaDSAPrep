package com.dsa.sorting;

import java.util.Arrays;

class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
    private static double average(int[] salary) {
        insertionSort(salary);
        System.out.println(Arrays.toString(salary));
        double amount = 0.0;
        for(int i = 1; i < salary.length - 1; i++){
            amount+=salary[i];
        }
        return amount/(salary.length - 2);
    }

    private static void insertionSort(int[] salary) {
        for(int i = 0; i < salary.length - 1; i++) {
            for(int j = i + 1; j> 0; j--) {
                if(salary[j] < salary[j - 1]){
                    int temp = salary[j];
                    salary[j] = salary[j -1];
                    salary[j -1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}