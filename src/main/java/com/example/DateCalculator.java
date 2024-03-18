package com.example;

import java.time.LocalDate;
import java.time.Period;

public class DateCalculator {
    public int calculateAge(LocalDate date1, LocalDate date2) {

//        return Math.abs(date1.getYear() - date2.getYear());

        int year = date1.getYear() - date2.getYear();
        int day = date1.getDayOfYear() - date2.getDayOfYear();

        if (year < 0) {
            if (day < 0){
                return Math.abs(year) + 1;
            }
            else if (day > 0){
                return Math.abs(year) - 1;
            }

            return Math.abs(year);

        } else if (year > 0) {
            if (day < 0) {
                return Math.abs(year) - 1;
            }
            else if (day > 0) {
                return Math.abs(year) + 1;
            }

            return Math.abs(year);
        }

        return 0;
    }


    public int calculateDay(LocalDate date1, LocalDate date2) {
        return Period.between(date1, date2).getDays();
    }

    public boolean isLeapYear(int year) {
        return LocalDate.ofYearDay(year, 1).isLeapYear();
    }
}
