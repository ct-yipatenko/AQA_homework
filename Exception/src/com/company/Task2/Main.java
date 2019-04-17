package com.company.Task2;

import com.company.Task1.MyException;

public class Main {

    public static void main(String[] args) {
        System.out.println(divideByZero());
    }

    public static int divideByZero() {
        try {
            int a = 10;
            int b = 5;
            if (a / b == 0) {
                throw new MyException();
            }
        } catch (MyException ex) {
            System.out.println("Exception");
        }
        return 0;
    }
}