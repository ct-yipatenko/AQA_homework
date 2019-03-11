package com.company;

public class TaskForEnumDays {

    public enum Day {

        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String args[]) {

        Day[] daysOfWeek = Day.values();

        for (Day today : daysOfWeek) {

            //Using Enum in Switch case statement

            switch (today) {
                case MONDAY:
                    System.out.println(today);
                    break;
                case TUESDAY:
                    System.out.println(today);
                    break;
                case WEDNESDAY:
                    System.out.println(today);
                    break;
                case THURSDAY:
                    System.out.println(today);
                    break;
                case FRIDAY:
                    System.out.println(today);
                    break;
                case SATURDAY:
                    System.out.println(today);
                    break;
                case SUNDAY:
                    System.out.println(today);
                    break;

            }
        }
    }
}

