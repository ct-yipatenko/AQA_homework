package com.company;

public class Task11
{
    public static void main(int n)
    {
        for (int columnscount=0; columnscount<n; columnscount++)
        {

            for (int linescount=n-columnscount; linescount>1; linescount--)
            {
                System.out.print(" ");
            }
            for (int count=0; count<=columnscount; count++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 6;
        main(n);

    }
}
