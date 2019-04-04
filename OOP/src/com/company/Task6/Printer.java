package com.company.Task6;

public class Printer {
    private String manufacturer;
    private double tonerLevel = 100;
    private int ammountOfPaper;
    private int numberOfPagesPrinted;
    private boolean isDoubleSided;

    public Printer(String manufacturer, double tonerLevel, int ammountOfPaper, boolean isDoubleSided) {
        this.manufacturer = manufacturer;
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.ammountOfPaper = ammountOfPaper;
        this.isDoubleSided = isDoubleSided;
    }

    private boolean isOutOfToner(double numberToPrint) {
        return tonerLevel - (numberToPrint / 2) < 0;
    }


    private boolean isOutOfPaper(double numberToPrint) {
        return ammountOfPaper - numberToPrint < 0;
    }

    private boolean twoSideNoPaperEven(double numberToPrint) {
        return ammountOfPaper - (int) numberToPrint / 2 < 0;
    }

    private boolean twoSideNoPaperOdd(double numberToPrint) {
        return ammountOfPaper - (int) numberToPrint / 2 - 1 < 0;
    }

    public void print(double numberToPrint) {

        if (isDoubleSided == false) {
            if (tonerLevel == 0) {
                System.out.println("No toner");
            }
            if (isOutOfPaper(numberToPrint) && (ammountOfPaper != 0)) {
                double different = ammountOfPaper - numberToPrint;
                numberToPrint = numberToPrint + different;
                System.out.println("Will run out of paper after this print, printing " + (int) numberToPrint + " pages");
                ammountOfPaper = 0;
            } else if (!isOutOfToner(numberToPrint) && (!isOutOfPaper(numberToPrint))) {
                ammountOfPaper -= numberToPrint;
                tonerLevel = tonerLevel - (numberToPrint / 2);
            }

        }
    }
    public void refillToner() {
        tonerLevel = 100;
    }

    public void refillPaper(int paper) {
        if (paper > 50) {
            System.out.println("Cannot put in more paper");
        } else {
            this.ammountOfPaper += paper;
        }
    }

    public int getAmmountOfPaper() {
        return ammountOfPaper;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(double tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setAmmountOfPaper(int ammountOfPaper) {
        this.ammountOfPaper = ammountOfPaper;
    }
}

class PrinterMain{
    public static void main(String[]args){
        Printer printer = new Printer("Canon", 100,300,true);
        printer.setAmmountOfPaper(25);
        System.out.println(printer.getAmmountOfPaper());
        printer.setTonerLevel(25);
        System.out.println(printer.getTonerLevel());

    }
}
