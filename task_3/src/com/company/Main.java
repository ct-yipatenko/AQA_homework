package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        //Task 1

        for(int i = 10; i <= 20; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        int x = 10;

        while (x <=20) {
            System.out.println(x);

            x++;
        }

        System.out.println();

        int y =10;

        do {
            System.out.println(y);
            y++;
        } while (y<=20);

        System.out.println();


        //Task 2


        for (int divided=1; divided<100; divided++) {
            if (divided%3==0)
                System.out.print(divided + " ");
        }

        System.out.println();
        System.out.println();


        //Task 3

        int [] array = new int[101];
        for (int a = 0; a < array.length; a++) {
            array[a] = (100 - a);
            System.out.println(array[a]);
        }

        System.out.println();

        //Task 4


        int[] numbers = {45,2,3,4,5,6,8,8,9,33};
        int sum = 0;
        for( int k=0; k<10; k++) {
            if (numbers[k] != numbers[0] && numbers[k] != numbers[numbers.length - 1])
            sum += numbers[k];
        }

        System.out.println(sum);


    }

}
