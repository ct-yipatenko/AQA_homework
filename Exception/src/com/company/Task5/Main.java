package com.company.Task5;


import java.lang.reflect.Type;

public class Main {

    public static void main(String[] args) {
        iCanThrowException(null);
    }

    private static void iCanThrowException(Type returnValue) {

        if(returnValue==null)
        {
            throw new NullPointerException("return value is null at method AAA");
        }

    }

}
