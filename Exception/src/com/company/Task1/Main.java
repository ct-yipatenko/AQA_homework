package com.company.Task1;

import java.security.InvalidAlgorithmParameterException;

public class Main {

    public static void main(String[] args) {
        int number = Integer.valueOf(args[0]);
        try {
            if (number == 0) {
                System.out.println("Number == 0");
            }
            if (number < 0) {
                throw new MyException();
            }
            System.out.println("Number > 0");

        } catch (MyException myEx) {
            System.out.println("My Exception() => Number < 0");
            System.out.println(myEx.getMessage());
            System.out.println(myEx.getCause());
            System.out.println(myEx.getMessage());


        }
    }

    static void validate(int age) throws InvalidAlgorithmParameterException {
        if (age > 18)
            throw new InvalidAlgorithmParameterException("not valid");

    }
}


