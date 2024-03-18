package com.example;

import java.time.LocalDate;
import java.time.Period;

public class DateCalculator {
    public int calculateAge(LocalDate date1, LocalDate date2) {
        return Math.abs(date1.getYear() - date2.getYear());
    }

    public int calculateDay(LocalDate date1, LocalDate date2) {
        return Period.between(date1, date2).getDays();
    }

    public boolean isLeapYear(int year) {
        return LocalDate.ofYearDay(year, 1).isLeapYear();
    }
}
