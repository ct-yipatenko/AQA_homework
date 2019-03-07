package com.company;

public class Task9
{
    public static void printStars(int n)
    {
        int columnscount, linescount;
        for(columnscount=0; columnscount<n; columnscount++)
        {
            for(linescount=0; linescount<=columnscount; linescount++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 7;
        printStars(n);
    }
}
