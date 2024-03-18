package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateCalculatorTest {
    private DateCalculator dateCalculator;

    @BeforeEach
    void beforeEach() {
        dateCalculator = new DateCalculator();
    }

    @Test
    @DisplayName("두 날짜의 나이 차이")
    void testCalcAge() {
        LocalDate birth = LocalDate.of(1990, 5, 15);
        LocalDate current = LocalDate.of(2024, 3, 18);

        Assertions.assertEquals(34, dateCalculator.calculateAge(birth, current));
    }

    @Test
    @DisplayName("두 날짜의 day 차이")
    void testCalcDay() {
        LocalDate birth = LocalDate.of(2024, 3, 15);
        LocalDate current = LocalDate.of(2024, 3, 18);

        Assertions.assertEquals(3, dateCalculator.calculateDay(birth, current));
    }

    @Test
    @DisplayName("윤년 test")
    void testLeapYear() {
        int year = 2024;
        Assertions.assertTrue(dateCalculator.isLeapYear(year));
    }
}
