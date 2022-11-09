package org.example;

public class Main {
    private static final int MIN_TO_HOUR = 60;
    private static final int HOUR_TO_DAY = 24;
    private static final int DAY_TO_YEAR = 365;
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){
        // Check if the input is valid
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        // Calculate the year and days
        int days = (int) (minutes / MIN_TO_HOUR) / HOUR_TO_DAY;
        int year = days / DAY_TO_YEAR;

        // Check the remaining days
        days %= DAY_TO_YEAR;

        // Print the result
        System.out.println(minutes + " min = " + year +" y and " + days + " d");
    }
}