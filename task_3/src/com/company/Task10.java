package com.company;

public class Task10
{
    public static void main(String[] x)
    {
        int columnsCount = 5;
        int linesCount = 8;

        for (int column = 0; column < columnsCount; column++) {

            for (int line = 0; line < linesCount; line++) {

                if (line == 0 || line == linesCount - 1 || column == 0 || column == columnsCount - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
