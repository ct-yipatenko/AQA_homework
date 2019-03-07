package com.company;

public class Task7
{
    static int greatcommondivisor(int a, int b)
    {

        // If one is < 10
        if (a  < 10 || b < 10)
            return -1;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return greatcommondivisor(a-b, b);
        return greatcommondivisor(a, b-a);
    }

    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.println("Great Common Divisor of " + a +" and " + b + " is " + greatcommondivisor(a, b));
    }
}
