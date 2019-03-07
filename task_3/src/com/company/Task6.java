package com.company;

public class Task6 {
    public static void main (String[] args){
        System.out.println(getEvenDigitSum(23458));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int reverse = 0;
        int num = number;
        int suma = 0;
        while (number != 0 | number > 0) {
            int last = number % 10;
            if (last % 2 == 0) {
                suma = suma + last;
            }
            reverse = reverse * 10;
            reverse = reverse + last;
            number = number / 10;
        }
        return suma;
    }
}
