package com.company.Task3;

import com.company.Task1.MyException;

public class Main {

    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);


        try {
            int b = 10 / a;
            int[] c = {1};
            System.out.println(c[1]);
            if (a == 0 || a !=  1){
                throw new ArithmeticException();
            }

        }
        catch (ArithmeticException ex){
            System.out.println("/ by zero");
        }

    }
}