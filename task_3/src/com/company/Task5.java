package com.company;

public class Task5 {

        public static void main(String[] args){
                System.out.println(min(8,11,9,5));
        }
        public static int min(int a, int b, int c, int d) {
                int min = a;
                if (min > b) min = b;
                if (min > c) min = c;
                if (min > d) min =d;
                return min;
        }
        }